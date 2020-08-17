//package day200816;
//
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
///**
// * @author Heroin X
// * @date 2020/8/16 19:00
// */
//public class Main12 {
//    public static void main(String[] args) {
//
//        int end =3;
//        int[][] arr = new int[4][4];
//
//        int dfs = dfs(end, arr, p, 0, 0);
//        ArrayList<Integer> list = new ArrayList<>();
//        int max = Integer.MAX_VALUE;
//        if (dfs<max){
//            max = dfs;
//        }
//        System.out.println(max);
//
//
//
//    }
//
//    public static int dfs(int end, int[][] arr, int p, int res,int index){
//
//            for (int j = 0; j<p; j++){
//                if (arr[index][j] != 0){
//                    res = res + arr[0][j];
//                    //2次循环
//                    if (j == end){
//                        return res;
//                    }
//                    dfs(end,arr,p,res,j);
//                }
//            }
//            return res;
//    }
//}
