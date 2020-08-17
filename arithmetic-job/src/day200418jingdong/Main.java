package day200418jingdong;

import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/4/20 17:00
 */
public class Main {
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
                int[] maxIndex ={-1,-1};

                for (int x = i; x < a;x++){
                    for (int y = j;y<b;y++){

//                       if (){
//
//
//                       }else{
//
//                           if (arr[x][y]>max){
//                               max = arr[x][y];
//                               maxIndex[0] =x;
//                               maxIndex[1] =y;
//                           }
//                       }


                    }
                }

                sum += max;
            }
        }
        System.out.println(sum);

    }

}
