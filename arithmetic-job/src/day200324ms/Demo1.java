package day200324ms;

import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/3/24 21:05
 */
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("请输入你的年龄：");
        int age = sc.nextInt();

        System.out.println("请输入你的姓名：");
        String name = sc.nextLine();


        System.out.println("请输入你的工资：");
        float salary = sc.nextFloat();

//        Scanner in = new Scanner(System.in);
//        while(in.hasNext()) {
//            int a = in.nextInt();
//            int b = in.nextInt();
//            System.out.println(a + b);
//        }
    }
}
