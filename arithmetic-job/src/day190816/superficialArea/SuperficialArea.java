package day190816.superficialArea;

import java.util.Scanner;

/**
 * @author Zhu
 * @date 2019/8/15 22:40
 */
public class SuperficialArea {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a= new int[n][m];
            int max_a = 0;
            for (int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    a[i][j] = sc.nextInt();
                    if (a[i][j]>max_a){
                        max_a=a[i][j];
                    }
                }
            }
            int res = 2*n*m;
            for (int k=1;k<=max_a;k++){
                for (int i=0;i<n;i++){
                    for (int j=0;j<m;j++){
                        if(a[i][j]>=k){
                            if (i==0 || a[i-1][j]<k) res++;
                            if (j==0 || a[i][j-1]<k) res++;
                            if (i==n-1 || a[i+1][j]<k) res++;
                            if (j==m-1 || a[i][j+1]<k) res++;
                        }
                    }
                }
            }
            System.out.println(res);
        }

}
