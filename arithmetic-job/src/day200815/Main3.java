package day200815;

import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/8/15 20:03
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        while (n > 0){
            n = n & (n-1);
            count++;
        }
        System.out.println(count);
    }

}
