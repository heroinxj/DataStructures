package flight;

import ilog.concert.IloException;
import ilog.concert.IloNumExpr;
import ilog.concert.IloNumVar;
import ilog.concert.IloNumVarType;
import ilog.cplex.IloCplex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2019/9/10 21:35
 */
public class AGAPSchedule2  {

    Data data;

    IloCplex model;

    /**
     * //定义类Data的对象
     * //定义cplex内部类的对象
     * //x[i][j]表示航班i选择登机口j
     */
    public IloNumVar[][] xVar;
    public IloNumVar[] yVar;
    public IloNumVar[] flightLocation1;
    public IloNumVar[] flightLocation2;
    double cost;

    /**
     * //目标值object
     * @param data
     */

    public AGAPSchedule2(Data data) throws IloException {
        this.data = data;
    }

    /**
     * 建立模型
     * @throws IloException
     */
    public void buildModel() throws IloException {
        //model
        model = new IloCplex();
        //variables
        xVar = new IloNumVar[data.flightNum][data.parkNum];
        yVar = new IloNumVar[data.parkNum];
        flightLocation1 = new IloNumVar[data.flightNum];
        flightLocation2 = new IloNumVar[data.flightNum];
        //定义变量的类型和取值范围
        for(int i = 0; i < data.flightNum; i++){
            for(int j = 0; j < data.parkNum; j++){
                xVar[i][j] = model.numVar(0, 1, IloNumVarType.Int, "xVar"+i+","+j);
            }
        }

        for(int i = 0; i < data.parkNum; i++){
            yVar[i] = model.numVar(0, 1, IloNumVarType.Int, "yVar"+i);
        }

        for(int i = 0; i < data.flightNum; i++){
            flightLocation1[i] = model.numVar(0, 1, IloNumVarType.Int, "flightALocation1"+i);
        }

        for(int i = 0; i < data.flightNum; i++){
            flightLocation2[i] = model.numVar(0, 1, IloNumVarType.Int, "flightALocation2"+i);
        }

        //优化目标
        IloNumExpr obj1 = model.numExpr();
        for(int i = 0; i < data.flightNum; i++){
            for(int j = 0; j < data.parkNum; j++){
                obj1 = model.sum(obj1, xVar[i][j]);
            }
        }

        IloNumExpr obj2 = model.numExpr();
        for(int i = 0; i < data.parkNum; i++){
            obj2 = model.sum(obj2, yVar[i]);
        }

        //........问题1优化目标..............
        //model.addMaximize(model.sum(obj1, model.prod(-0.01, obj2)));
        IloNumExpr obj3 = model.numExpr();
        for(int i = 0; i < data.passengerList.size(); i++){
            Passenger p = data.passengerList.get(i);
            int pArrive = p.arriveFlight;
            int pLeave = p.leaveFlight;
            IloNumExpr exp= model.numExpr();
            exp = model.sum(exp,model.prod(model.prod(flightLocation1[pArrive], flightLocation1[pLeave]),data.tranTime[1-data.flightList.get(pArrive).arriveType][1-data.flightList.get(pLeave).leaveType][0][0][0]));
            exp = model.sum(exp,model.prod(model.prod(flightLocation1[pArrive], flightLocation2[pLeave]),data.tranTime[1-data.flightList.get(pArrive).arriveType][1-data.flightList.get(pLeave).leaveType][0][1][0]));
            exp = model.sum(exp,model.prod(model.prod(flightLocation2[pArrive], flightLocation1[pLeave]),data.tranTime[1-data.flightList.get(pArrive).arriveType][1-data.flightList.get(pLeave).leaveType][1][0][0]));
            exp = model.sum(exp,model.prod(model.prod(flightLocation2[pArrive], flightLocation2[pLeave]),data.tranTime[1-data.flightList.get(pArrive).arriveType][1-data.flightList.get(pLeave).leaveType][1][1][0]));
            obj3 = model.sum(obj3, model.prod(exp, p.passengerNum));
        }

        //.......问题2优化目标........
        model.addMinimize(model.sum(model.sum(obj3, model.prod(0.01, obj2)),model.prod(100000, model.diff(256, obj1))));
        //约束1：属性匹配
        for(int i = 0; i < data.flightNum; i++){
            for(int j = 0; j < data.parkNum; j++){
                if(data.isTypeMatching[i][j] == 0){
                    model.addEq(xVar[i][j], 0);
                }
            }
        }

        //约束2：每个航班只能选择一个登机口
        for(int i = 0; i < data.flightNum; i++){
            IloNumExpr exp1 = model.numExpr();
            for(int j = 0; j < data.parkNum; j++){
                exp1 = model.sum(exp1, xVar[i][j]);
            }
            model.addLe(exp1, 1);
        }

        //约束3：间隔时间小于45分钟
        for(int i = 0; i < data.flightNum; i++){
            for(int j = 0; j < data.flightNum; j++){
                if(i == j)
                    continue;
                for(int k = 0; k < data.parkNum; k++){
                    if(data.isTypeMatching[i][k] == 1 && data.isTypeMatching[j][k] == 1 && data.isConflict[i][j] == 1)
                        model.addLe(model.sum(xVar[i][k], xVar[j][k]), 1);
                }
            }
        }

        //约束4：只能选择开放的登机口
        for(int i = 0; i < data.flightNum; i++){
            for(int j = 0; j < data.parkNum; j++){
                model.addLe(xVar[i][j], yVar[j]);
            }
        }

        //约束5：记录每个航班的位置匹配情况
        for(int i = 0; i < data.flightNum; i++){
            IloNumExpr exp2 = model.numExpr();
            IloNumExpr exp3 = model.numExpr();
            for(int j = 0; j < 28; j++){
                exp2 = model.sum(exp2, xVar[i][j]);
            }
            for(int j = 28; j < data.parkNum; j++){
                exp3 = model.sum(exp3, xVar[i][j]);
            }
            model.addEq(flightLocation1[i], exp2);
            model.addEq(flightLocation2[i], exp3);
        }
    }

    public static void processAGAPSchedule(Data data) throws FileNotFoundException {
        String line = null;
        String[] substr = null;
//        Scanner cin = new Scanner(new BufferedReader(new FileReader("D://data//AGAP//flight.csv")));
        // 读取文件
        Scanner cin = new Scanner(new BufferedReader(new FileReader("E:\\2019学年\\1_数学建模2019\\练习题\\第十五届“华为杯”中国研究生数学建模竞赛—F题\\flght3.csv")));
        //读取一行
        line = cin.nextLine();

        //初始化参数
        data.flightNum = 303;
        data.parkNum = 69;
        data.deportList = new ArrayList<Deport>();
        data.flightList = new ArrayList<Flight>();
        data.passengerList = new ArrayList<Passenger>();
        data.isTypeMatching = new int[data.flightNum][data.parkNum];
        data.isConflict = new int[data.flightNum][data.flightNum];
        while(cin.hasNextLine()){
            line = cin.nextLine();
            substr = line.split((","));
            Flight flight = new Flight();
            flight.name = substr[0];
            if(substr[1].charAt(0) == '-'){
                String number = substr[1].substring(1);
                flight.startTime = -1 * Integer.parseInt(number);
            }else {
                flight.startTime = Integer.parseInt(substr[1]);
            }
            flight.arriveType = Integer.parseInt(substr[3]);
            flight.endTime = Integer.parseInt(substr[5]);
            flight.leaveType = Integer.parseInt(substr[7]);
            flight.planeType = substr[10].charAt(0);
            data.flightList.add(flight);
        }


        cin.close();//关闭流
        // "D://data//AGAP//InputData.csv")
        cin = new Scanner(new BufferedReader(new FileReader("E:\\2019学年\\1_数学建模2019\\练习题\\第十五届“华为杯”中国研究生数学建模竞赛—F题\\InputData.csv")));
        cin.nextLine();
        while(cin.hasNextLine()){
            line = cin.nextLine();
            substr = line.split((","));
            Deport deport = new Deport();
            deport.name = substr[0];
            deport.location = substr[1].charAt(0);
            deport.area = substr[2];
            deport.arriveType = Integer.parseInt(substr[3]);
            deport.leaveType = Integer.parseInt(substr[4]);
            deport.planeType = substr[5].charAt(0);
            data.deportList.add(deport);
        }
        cin.close();

        //"D://data//AGAP//passenger.csv"
        cin = new Scanner(new BufferedReader(new FileReader("D://data//AGAP//passenger.csv")));
        cin.nextLine();
        while(cin.hasNextLine()){

            line = cin.nextLine();
            substr = line.split((","));
            Passenger passenger = new Passenger();
            passenger.passengerNum = Integer.parseInt(substr[0]);
            passenger.arriveFlight = Integer.parseInt(substr[1]);
            passenger.leaveFlight = Integer.parseInt(substr[2]);
            data.passengerList.add(passenger);
        }

        cin.close();
        for(int i = 0; i < data.flightList.size(); i++){
            for(int j = 0; j < data.deportList.size(); j++){
                if((data.flightList.get(i).arriveType == data.deportList.get(j).arriveType || data.deportList.get(j).arriveType == 2) &&
                        (data.flightList.get(i).leaveType == data.deportList.get(j).leaveType || data.deportList.get(j).leaveType == 2) &&
                        data.flightList.get(i).planeType == data.deportList.get(j).planeType)
                    data.isTypeMatching[i][j] = 1;
            }
        }
        for(int i = 0; i < data.flightList.size(); i++){
            for(int j = 0; j < data.flightList.size(); j++){
                if(i == j)
                    continue;
                Flight flight1 = data.flightList.get(i);
                Flight flight2 = data.flightList.get(j);
                data.isConflict[i][j] = 1;
                if(flight1.endTime + 45 <= flight2.startTime)
                    data.isConflict[i][j] = 0;
                if(flight1.startTime - 45 >= flight2.endTime)
                    data.isConflict[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Data data = new Data();
        processAGAPSchedule(data);

        System.out.println("input succesfully");
        System.out.println("cplex procedure###########################");
        AGAPSchedule2 cplex = new AGAPSchedule2(data);

        cplex.buildModel();
        double cplex_time1 = System.nanoTime();
//        cplex.solve();
        double cplex_time2 = System.nanoTime();

        double cplex_time = (cplex_time2 - cplex_time1) / 1e9;//求解时间，单位s
        System.out.println("cplex_time " + cplex_time + " bestcost " + cplex.cost);
    }



}
