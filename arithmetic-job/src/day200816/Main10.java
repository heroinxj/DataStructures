//package day200816;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
///**
// * @author Heroin X
// * @date 2020/8/16 19:00
// */
//public class Main10 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] s1 = sc.nextLine().split(" ");
//        // N-路标数，P-通道数
//        int n = Integer.parseInt(s1[0]);
//        int p = Integer.parseInt(s1[1]);
//        HashMap<String, Integer> hash  = new HashMap<>();
//        for (int i = 0; i < p; i++){
//            String[] s2 = sc.nextLine().split(" ");
//            StringBuilder sb = new StringBuilder();
//            String key = sb.append(s2[0]).append("-").append(s2[1]).toString();
//            hash.put(key,Integer.parseInt(s2[2]));
//        }
//        int end = Integer.parseInt(sc.nextLine());
//        System.out.println(end);
//        dfs(end-1,end,hash,new ArrayList<String>());
//
//
//    }
//
//    int minTime = Integer.MAX_VALUE;
//    public static int dfs(int start, int end, HashMap<String, Integer> hash, ArrayList<String> list){
//
//        if (!hash.containsKey(start+"-"+end)){
//            return ;
//        }
//    }
//}
