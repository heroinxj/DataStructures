package practice;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *  度小满2019-卡车过桥
 *
 *    作者：奶茶弟弟
 *     链接：https://www.nowcoder.com/discuss/291654?type=post&order=time&pos=&page=1
 *     来源：牛客网
 *
 *     用一个优先级队列维持当前桥上的车子，比较的是下车时间  ，
 *     当桥上重量<=limit 上桥，车子的下车时间为已花费时间+过桥时间，
 *     当大于时，车子下车，更新已花费的时间为车子下车时间
 *
 * 输入
 * 第一行输入两个整数 N车、W承载（1 <= N、W <= 100000）。
 * 第二行输入 N重量 个整数 w[1] 到 w[N]（1 <= w[i] <= W）。
 * 第三行输入 N时间 个整数 t[1] 到 t[N]（1 <= t[i] <= 10000）。
 *
 * 输出
 * 输出一个整数，表示所有车辆过桥所需的最短时间。
 *
 * 样例输入
 * 4 2
 * 1 1 1 1
 * 2 1 2 2
 * 样例输出
 * 4
 *
 * @author Heroin X
 * @date 2020/4/20 12:42
 */
public class Main4 {


    public static  void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int limit=in.nextInt();

        Car[] cars=new Car[n];
        for(int i=0;i<n;i++)
            cars[i]=new Car(in.nextInt(), 0);

        for(int i=0;i<n;i++)
            cars[i].t=in.nextInt();

        PriorityQueue<Car> list=new PriorityQueue<>((o1, o2)-> {
            return o1.compare(o2);
        });

//        PriorityQueue<Car> objects = new PriorityQueue<>(new Comparator<Car>() {
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o2.t-o1.t;
//            }
//        });


        int sum=0,cur=0;
        for(int i=0;i<n;){
            if(cur+cars[i].w<=limit){
                cars[i].t+=sum;
                list.offer(cars[i]);
                cur+=cars[i].w;
                i++;
            }else{
                Car  car=list.poll();
                sum=car.t;
                cur-=car.w;
                while (list.size()>0 &&list.peek().t==sum){
                    car=list.poll();
                    cur-=car.w;
                }
            }
        }
        while (list.size()>0){
            sum=list.poll().t;
        }
        System.out.println(sum);


    }

    static  class Car{
        int w;
        int t;
        public Car(int w, int t) {
            this.w = w;
            this.t = t;
        }
        public  int compare(Car o){
            return  this.t-o.t;
        }
    }

}
