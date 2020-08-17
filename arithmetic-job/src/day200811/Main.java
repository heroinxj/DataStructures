package day200811;

import java.util.Scanner;

/**
 * 贝壳第3题——牛牛走方格
 */
public class Main {

    static int m1 = 0;
    static int n1 = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.valueOf(sc.nextLine());
        for (int i=0; i < a; i++){
            String s1 = sc.nextLine();
            String[] a1 = s1.split(" ");
            int m = Integer.valueOf(a1[0]);
            int n = Integer.valueOf(a1[1]);
            m1 = m;
            n1 = n;
            int dfs = dfs(m, n);
            System.out.println(dfs);
        }
    }

    public static int dfs(int m, int n){
        if (m == 1 || n == 1){
            return 1;
        }
//        if (m == m1 || n==n1){
//            return 1;
//        }
//        return dfs(m-1,n)+dfs(m,n-1);
        //走过的点不可以再次进入！
        return dfs(m-1,n)+dfs(m+1,n)+dfs(m,n-1);
    }
}
