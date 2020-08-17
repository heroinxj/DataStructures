package day200816;

import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/8/16 14:56
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int bonus = bonus(n);
        System.out.println(bonus);
    }

    public int CalulateMethodCount (int num_money) {
        if (num_money <= 0){
            return 0;
        }
        if (num_money == 1){
            return 1;
        }else{
            return 2 * CalulateMethodCount(num_money-1);
        }
    }

    public static int bonus(int n){
        if (n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }else{
            return 2 * bonus(n-1);
        }
    }
}
