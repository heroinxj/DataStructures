package day200410meituan;

import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/4/9 19:06
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        String b = in.next();
        int c = in.nextInt();
//        int a = 3;
//        String b = "02:10";
//        int c = 5;
        new Main1().solution(a,b,c);
//        String addzero = new day200410meituan.MTest1().addzero(2);

    }

    public void solution(int a, String b, int c){
        int day = a;
        String time = b;
        int ago = c;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
        String[] split = time.split(":");
        String hour = split[0];
        if (hour.charAt(0)==0){
            hour= String.valueOf(hour.charAt(1));
        }
        int hour1 = Integer.parseInt(hour);
        String min = split[1];
        if (min.charAt(0)==0){
            min = String.valueOf(min.charAt(1));
        }
        int min1 = Integer.valueOf(min);
        int total  = hour1*60+min1;

        int rest = total -ago;

        // 统一处理0问题！！！
        int day2 =day;
        int hour2 =0;
        int min2 = 0;
        StringBuilder time2 = new StringBuilder();
        if (rest > 0){
            hour2 = rest / 60;
            min2 = rest % 60;

        }else{
            rest = -rest;
            int d = rest/24*60;
            d = d % 7;
            day2 = day2 - d;
            if (day2 < 0){
                day2 = day2 + 7;
            }
            rest = rest % (24*60);
            int m = 24*60 - rest;
            hour2 = m / 60;
            min2 = m% 60;
        }
        if (hour2<10 || min2 < 10){
            if (hour2<10){
                String h = addzero(hour2);
                if (min2<10){
                    String m = addzero(min2);
                    time2.append(h).append(":").append(m);
                }else{
                    time2.append(h).append(":").append(min2);
                }
            }else if(min2<10){
                String m = addzero(min2);
                time2.append(hour2).append(":").append(m);
            }
        }else{
            time2.append(hour2).append(":").append(min2);
        }


        System.out.println(day2);
        System.out.println(time2);
    }

    private String addzero(int a){
        StringBuilder sb =new StringBuilder();
        sb.append(0).append(a);
        return sb.toString();
    }
}
