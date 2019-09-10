package day190816.superficialArea;

import java.util.Scanner;

/**
 * 360内推编程第一题-表面积
 * ZZ
 */
public class Area {
    public static void main(String[] args) {
        //数据读入
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a= new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                a[i][j] = sc.nextInt();
            }
        }
        //上表面积
        int res = n*m;
        //左表面积
        for (int i=0;i<n;i++){
            res += a[i][0];
            for (int j=1;j<m;j++){
                if(a[i][j]>a[i][j-1]){
                    res += a[i][j]-a[i][j-1];
                }
            }
        }
        //后表面积
        for (int i=0;i<m;i++){
            res += a[0][i];
            for (int j=1;j<n;j++){
                if(a[j][i]>a[j-1][i]){
                    res += a[j][i]-a[j-1][i];
                }
            }
        }
        //上下、左右、前后表面积相同
        res *= 2;
        System.out.println(res);
    }
}