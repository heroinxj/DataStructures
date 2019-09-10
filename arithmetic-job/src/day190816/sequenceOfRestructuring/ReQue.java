package day190816.sequenceOfRestructuring;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 360内推编程第二题-序列重组
 *  ZZ
 */
public class ReQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[2][m];//m进制数字桶
        //统计两个数中各数字出现次数，并进桶
        for (int i=0;i<2;i++){
            for (int j=0;j<n;j++){
                a[i][sc.nextInt()]++;
            }
        }
        int[] res = new int[n];//结果数组
        int count=0;
        //数字配对
        for (int i=0;i<m;i++){ //遍历桶
            for (int j=0;j<2;j++){ //区分两个数
                while (a[j][i]>0){
                    int k = m-i-1; //数字和的模尽量大
                    while (a[1-j][k]==0){ //模从大向小搜索数字配对
                        k--;
                        if (k<0){
                            k += m;
                        }
                    }
                    res[count++]=(i+k)%m;
                    a[j][i]--;
                    a[1-j][k]--;
                }
            }
            if (count == n){
                break;
            }
        }
        Arrays.sort(res);//结果排序
        for (int i=n-1;i>=0;i--){ //反向输出
            System.out.print(res[i] + " ");
        }
    }
}