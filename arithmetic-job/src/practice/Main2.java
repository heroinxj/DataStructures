package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/4/17 12:54
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String[] s1 = sc.nextLine().trim().split(" ");
            int m = Integer.parseInt(s1[0]);
            int n = Integer.parseInt(s1[1]);

            String split = sc.nextLine();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextLine();
            }

            String[] split1 = split.trim().split(" ");
            int[] sp = new int[m];
            for (int i =0; i< m;i++){
                sp[i]= Integer.parseInt(split1[i]);
            }
            Arrays.sort(sp);

            //min
            int min = 0;
            for (int i =0; i < n; i++){
                min += sp[i];
            }

            int max = 0;
            for (int i = m-1; i>m-1-n;i--){
                max += sp[i];
            }

            System.out.println(min+" "+max);
        }

    }
}
