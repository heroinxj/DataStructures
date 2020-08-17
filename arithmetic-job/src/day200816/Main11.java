package day200816;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/8/16 19:00
 */
public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        // N-路标数，P-通道数
        int n = Integer.parseInt(s1[0]);
        int p = Integer.parseInt(s1[1]);
        int[][] arr = new int[n][n];
//        Arrays.fill(arr,0);
        for (int i = 0; i < p; i++){
            String[] s2 = sc.nextLine().split(" ");
            int x = Integer.parseInt(s2[0]);
            int y = Integer.parseInt(s2[1]);
            arr[x][y] = Integer.parseInt(s2[2]);
        }
        int end = Integer.parseInt(sc.nextLine());
//        System.out.println(end);
        dfs(end, arr, n, 0, 0);
        ArrayList<Integer> list = new ArrayList<>();
//        int max = Integer.MAX_VALUE;
//        if (dfs<max){
//            max = dfs;
//        }
//        System.out.println(max);
    }



    public static void dfs(int end, int[][] arr, int n, int res,int index){

        if (index == end){
            System.out.println(res);
            return ;
        }

        for (int j = 0; j<n; j++){
            if (arr[index][j] != 0){
                res = res + arr[index][j];
                //2次循环
                dfs(end,arr,n,res,j);

            }
        }


    }
}
