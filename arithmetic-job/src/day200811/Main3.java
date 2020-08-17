package day200811;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i =0; i<a; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n==1){
                System.out.println(getVal(m));
            }else if (m==1){
                System.out.println(getVal(n));
            }else {
                int minVal = Math.min(getVal(n), getVal(m));
                System.out.println(minVal);
            }


        }
    }

    public static int getVal(int x){
        for (int i = 2; i <= Math.pow(x, 0.5); i++){
            if (x%i == 0){
                return i;
            }
        }
        return x;
    }
}
