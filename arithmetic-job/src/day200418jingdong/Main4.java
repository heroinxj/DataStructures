package day200418jingdong;

import java.util.Scanner;

/**
 * 度小满第一题，
 * @author Heroin X
 * @date 2020/4/20 17:00
 */
public class Main4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int[][] arr = new int[m][n];

        // 原始数组
        for (int i =0 ; i< m ;i++){
            for (int j=0; j <n; j++){
                arr[i][j] = (i+1)*(j+1)%10;
            }
        }

        // 遍历
        int sum = 0;
        for (int i = 0; i<m-a+1;i++){
            for (int j =0; j< n-b+1; j++){

                int max = 0;
                for (int x = i; x < a+i;x++){
                    for (int y = j;y < b+j;y++){
                        if (arr[x][y]>max){
                            max = arr[x][y];
                        }
                    }
                }

                sum += max;
            }
        }
        System.out.println(sum);

    }

}
