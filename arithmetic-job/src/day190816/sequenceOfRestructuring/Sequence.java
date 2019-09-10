package day190816.sequenceOfRestructuring;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2019/8/15 23:20
 */
public class Sequence {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] a = new int[2][m];
            for (int i=0;i<2;i++){
                for (int j=0;j<n;j++){
                    a[i][sc.nextInt()]++;
                }
            }
            int[] res = new int[n];
            int count=0;
            for (int i=0;i<m;i++){
                for (int j=0;j<2;j++){
                    while (a[j][i]>0){
                        int k = m-i-1;
                        while (a[1-j][k]==0){
                            k--;
                            if (k<0){
                                k += m;
                            }
                        }
                        res[count++]=(a[j][i]+a[1-j][k])%m;
                        a[j][i]--;
                        a[1-j][k]--;
                    }
                }
                if (count == n){
                    break;
                }
            }
            Arrays.sort(res);
            for (int i=n-1;i>=0;i--){
                System.out.print(res[i]);
                System.out.print(' ');
            }
        }
    }


