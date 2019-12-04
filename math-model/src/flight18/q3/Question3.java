//package flight18.q3;
//
//import flight18.q1.Data;
//import flight18.q1.Passenger;
//import ilog.concert.IloException;
//import ilog.concert.IloNumExpr;
//import ilog.concert.IloNumVar;
//import ilog.concert.IloNumVarType;
//import ilog.cplex.IloCplex;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
///**
// * @author Heroin X
// * @date 2019/9/10 22:29
// */
//public class Question3 {
//
//
//    Data data;
//
//    IloCplex model;
//
//    /**
//     * //定义类Data的对象
//     * //定义cplex内部类的对象
//     * //x[i][j]表示航班i选择登机口j
//     */
//    public IloNumVar[][] xVar;
//    public IloNumVar[] yVar;
//    public IloNumVar[] flightLocation1;
//    public IloNumVar[] flightLocation2;
//    double cost;
//
//
//
//    public void build_model() throws IloException {
////model
//        model = new IloCplex();
////variables
//        xVar = new IloNumVar[data.flightNum][data.parkNum];
//        yVar = new IloNumVar[data.parkNum];
//        flightArea = new IloNumVar[7][data.flightNum];
//        flightAreaPassenger = new IloNumVar[data.passengerList.size()][7][7];
////定义变量的类型和取值范围
//        for (int i = 0; i < data.flightNum; i++) {
//            for (int j = 0; j < data.parkNum; j++) {
//                xVar[i][j] = model.numVar(0, 1, IloNumVarType.Int, "xVar" + i + "," + j);
//            }
//        }
//        for (int i = 0; i < data.parkNum; i++) {
//            yVar[i] = model.numVar(0, 1, IloNumVarType.Int, "yVar" + i);
//        }
//        for (int i = 0; i < 7; i++) {
//            for (int j = 0; j < data.flightNum; j++) {
//                flightArea[i][j] = model.numVar(0, 1, IloNumVarType.Int, "flightArea" + i + "," + j);
//            }
//        }
//        for (int p = 0; p < data.passengerList.size(); p++) {
//            for (int i = 0; i < 7; i++) {
//                for (int j = 0; j < 7; j++) {
//                    flightAreaPassenger[p][i][j] = model.numVar(0, 1, IloNumVarType.Int, "flightAreaPassenger" + p + "," + i + "," + j);
//                }
//            }
//        }
//
//        //优化目标
//        IloNumExpr obj1 = model.numExpr();
//        for (int i = 0; i < data.flightNum; i++) {
//            for (int j = 0; j < data.parkNum; j++) {
//                obj1 = model.sum(obj1, xVar[i][j]);
//            }
//        }
//        IloNumExpr obj2 = model.numExpr();
//        for (int i = 0; i < data.parkNum; i++) {
//            obj2 = model.sum(obj2, yVar[i]);
//        }
////model.addMaximize(model.sum(obj1, model.prod(-0.01, obj2)));
//
//        IloNumExpr tranTimeDegreeSum = model.numExpr();
//        for (int i = 0; i < data.passengerList.size(); i++) {
//            Passenger p = data.passengerList.get(i);
//            int pArrive = p.arriveFlight;
//            int pLeave = p.leaveFlight;
//            IloNumExpr exp = model.numExpr();
//            IloNumExpr expSum = model.numExpr();
//            for (int m = 0; m < 7; m++) {
//                for (int n = 0; n < 7; n++) {
//                    if (data.isAreaMatching[pArrive][m] == 1 && data.isAreaMatching[pLeave][n] == 1) {
//                        expSum = model.sum(expSum, model.prod(flightAreaPassenger[i][m][n], data.tranTimeSum[1 - data.flightList.get(pArrive).arriveType][1 - data.flightList.get(pLeave).leaveType][m][n]));
//
//                    }
//                }
//            }
//            tranTimeDegreeSum = model.sum(tranTimeDegreeSum, model.prod(model.prod(model.sum(exp, expSum), 1.0 / p.connectTime), p.passengerNum));
//        }
//
//        model.addMinimize(model.sum(model.sum(model.prod(10, tranTimeDegreeSum), model.prod(0.01,
//                38
//                obj2)), model.prod(100000, model.diff(256, obj1))));
////约束1：属性匹配
//        for (int i = 0; i < data.flightNum; i++) {
//            for (int j = 0; j < data.parkNum; j++) {
//                if (data.isTypeMatching[i][j] == 0)
//                    model.addEq(xVar[i][j], 0);
//            }
//        }
//
//        //约束2：每个航班只能选择一个登机口
//        for (int i = 0; i < data.flightNum; i++) {
//            IloNumExpr exp1 = model.numExpr();
//            for (int j = 0; j < data.parkNum; j++) {
//                exp1 = model.sum(exp1, xVar[i][j]);
//            }
//            model.addLe(exp1, 1);
//        }
//
//        //约束3：间隔时间小于45分钟
//        for (int i = 0; i < data.flightNum; i++) {
//            for (int j = 0; j < data.flightNum; j++) {
//                if (i == j)
//                    continue;
//                for (int k = 0; k < data.parkNum; k++) {
//                    if (data.isTypeMatching[i][k] == 1 && data.isTypeMatching[j][k] == 1 && data.isConflict[i][j] == 1)
//                        model.addLe(model.sum(xVar[i][k], xVar[j][k]), 1);
//                }
//            }
//        }
//
//        //约束4：只能选择开放的登记口
//        for (int i = 0; i < data.flightNum; i++) {
//            for (int j = 0; j < data.parkNum; j++) {
//                model.addLe(xVar[i][j], yVar[j]);
//            }
//        }
////约束5：记录每个航班的区域匹配情况
//        for (int i = 0; i < data.flightNum; i++) {
//            IloNumExpr exp1 = model.numExpr();
//            IloNumExpr exp2 = model.numExpr();
//            IloNumExpr exp3 = model.numExpr();
//            IloNumExpr exp4 = model.numExpr();
//            IloNumExpr exp5 = model.numExpr();
//            IloNumExpr exp6 = model.numExpr();
//            IloNumExpr exp7 = model.numExpr();
//
//            for (int j = 0; j < 9; j++) {
//                exp1 = model.sum(exp1, xVar[i][j]);
//            }
//            for (int j = 9; j < 19; j++) {
//                exp2 = model.sum(exp2, xVar[i][j]);
//            }
//            for (int j = 19; j < 28; j++) {
//                exp3 = model.sum(exp3, xVar[i][j]);
//            }
//            for (int j = 28; j < 38; j++) {
//                exp4 = model.sum(exp4, xVar[i][j]);
//            }
//            for (int j = 38; j < 48; j++) {
//                exp5 = model.sum(exp5, xVar[i][j]);
//            }
//            for (int j = 48; j < 58; j++) {
//                exp6 = model.sum(exp6, xVar[i][j]);
//            }
//            for (int j = 58; j < data.parkNum; j++) {
//                exp7 = model.sum(exp7, xVar[i][j]);
//            }
//            model.addEq(flightArea[0][i], exp1);
//            model.addEq(flightArea[1][i], exp2);
//            model.addEq(flightArea[2][i], exp3);
//            model.addEq(flightArea[3][i], exp4);
//            model.addEq(flightArea[4][i], exp5);
//            model.addEq(flightArea[5][i], exp6);
//            model.addEq(flightArea[6][i], exp7);
//        }
//
//        //约束6：确定每个旅客的转换时间
//        for (int p = 0; p < data.passengerList.size(); p++) {
//            Passenger passenger = data.passengerList.get(p);
//            int pArrive = passenger.arriveFlight;
//            int pLeave = passenger.leaveFlight;
//            for (int i = 0; i < 7; i++) {
//                for (int j = 0; j < 7; j++) {
//                    if (data.isAreaMatching[pArrive][i] == 1 && data.isAreaMatching[pLeave][j] == 1) {
//                        model.addLe(model.diff(model.sum(flightArea[i][pArrive], flightArea[j][pLeave]), flightAreaPassenger[p][i][j]), 1);
//                    }
//                }
//            }
//        }
//    }
//
//    /**
//     * 禁忌搜索
//     *
//     * @param solution
//     * @return
//     */
//    public int[] search(int[] solution) {
////记录历史最优解
//        int[] bestSolution = new int[data.flightNum];
//        for (int i = 0; i < data.flightNum; i++) {
//            bestSolution[i] = solution[i];
//        }
//        double bestCost = evaluation(solution);
//        int iteration = 0;
//        int[][] tabuList = new int[data.flightNum][data.parkNum];
//        List<List<Integer>> departList = new ArrayList<List<Integer>>();
//        for (int i = 0; i < data.parkNum; i++) {
//            List<Integer> list = new ArrayList<Integer>();
//            departList.add(list);
//        }
//        for (int i = 0; i < data.flightNum; i++) {
//            if (solution[i] >= 0)
//                departList.get(solution[i]).add(i);
//        }
//        double cost = bestCost;
//        while (iteration < 100) {
////更新禁忌表
//            for (int i = 0; i < data.flightNum; i++) {
//                for (int j = 0; j < data.parkNum; j++) {
//                    if (tabuList[i][j] > 0)
//                        tabuList[i][j] = tabuList[i][j] - 1;
//                }
//            }
//            //解外交换操作
//            int exchangeA = 0;
//            int exchangeB = 0;
//            int exchangePark = 0;
//            boolean isinnerExchange = false;
//            double minCostChange = 1000000000;
//            Random random = new Random();
//            for (int i = 0; i < data.flightNum; i++) {
//                if (solution[i] < 0) {
//                    for (int j = 0; j < data.parkNum; j++) {
//                        if (data.isTypeMatching[i][j] == 0)
//                            continue;
//                        for (int p = 0; p < departList.get(j).size(); p++) {
//                            int q = departList.get(j).get(p);
//                            solution[q] = -1;
//                            solution[i] = j;
//                            double costChange = evaluation(solution);
//                            if (costChange - cost < minCostChange) {
//                                if ((tabuList[i][j] > 0) && costChange > bestCost)
//                                    continue;
//                                exchangeA = i;
//                                exchangeB = q;
//                                exchangePark = j;
//                                minCostChange = costChange - cost;
//                            }
//                            solution[q] = j;
//                            solution[i] = -1;
//                        }
//                    }
//                }
//            }
//
//            //解内交换操作
//            for (int i = 0; i < data.flightNum; i++) {
//                if (solution[i] >= 0) {
//                    for (int j = 0; j < data.parkNum; j++) {
//                        if (solution[i] == j)
//                            continue;
//                        if (data.isTypeMatching[i][j] == 0)
//                            continue;
//                        for (int p = 0; p < departList.get(j).size(); p++) {
//                            int q = departList.get(j).get(p);
//                            if (data.isTypeMatching[q][solution[i]] == 0)
//                                continue;
//                            solution[q] = solution[i];
//                            solution[i] = j;
//                            double costChange = evaluation(solution);
//                            if (costChange - cost < minCostChange) {
//                                if ((tabuList[i][j] > 0) && costChange > bestCost)
//                                    continue;
//                                exchangeA = i;
//                                exchangeB = q;
//                                isinnerExchange = true;
//                                minCostChange = costChange - cost;
//                            }
//                            solution[i] = solution[q];
//                            solution[q] = j;
//                        }
//                    }
//                }
//            }
//
//            if (isinnerExchange) {
//                for (int i = 0; i < departList.get(solution[exchangeA]).size(); i++) {
//                    if (departList.get(solution[exchangeA]).get(i) == exchangeA)
//                        departList.get(solution[exchangeA]).remove(i);
//                }
//                departList.get(solution[exchangeA]).add(exchangeB);
//                for (int i = 0; i < departList.get(solution[exchangeB]).size(); i++) {
//                    if (departList.get(solution[exchangeB]).get(i) == exchangeB)
//                        departList.get(solution[exchangeB]).remove(i);
//                }
//                departList.get(solution[exchangeB]).add(exchangeA);
//                int index = solution[exchangeA];
//                solution[exchangeA] = solution[exchangeB];
//                solution[exchangeB] = index;
//            } else {
//                solution[exchangeB] = -1;
//                solution[exchangeA] = exchangePark;
//                for (int i = 0; i < departList.get(exchangePark).size(); i++) {
//                    if (departList.get(exchangePark).get(i) == exchangeB)
//                        departList.get(exchangePark).remove(i);
//                }
//                departList.get(exchangePark).add(exchangeA);
//            }
//            cost = cost + minCostChange;
//            tabuList[exchangeA][exchangePark] = random.nextInt(10) + 10;
////tabuList[exchangeB][exchangePark] = 5;
//            //更新最优
//            if (cost < bestCost) {
//                for (int i = 0; i < data.flightNum; i++) {
//                    bestSolution[i] = solution[i];
//                }
//                bestCost = cost;
//            }
//            cost = evaluation(solution);
//            System.out.println(cost);
//            iteration++;
//        }
//        return bestSolution;
//    }
//}
//
//
//
