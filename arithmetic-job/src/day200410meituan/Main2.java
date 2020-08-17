package day200410meituan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/4/9 20:19
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();
        Main2 main2 = new Main2();
        main2.solution(a,b,c);

        while(in.hasNext()) {
//            int a = in.nextInt();
//            in.nextLine();
//            int f = in.nextInt();
//
//            String b = in.nextLine();
//            String c = in.nextLine();
//            String a = in.nextLine();
//            int d = in.nextInt();
//            int e = in.nextInt();
//            Main2 main2 = new Main2();
//            main2.solution(a,b,c);
        }

    }

    private void solution(int a, String b, String c){
        int len  = a;
        String[] start = b.split(" ");
        String[] end = b.split(" ");
        int[] start1 = change(start);
        int[] end1 = change(end);
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <len; i++){
            list.add(start1[i]);
        }

        for (int i = 0; i <len; i++){
            int tmp = end1[i];

        }
        int[] tmp ={};

        System.out.println();

    }

    private int[] change(String[] arr){
        int len = arr.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++){
            int tmp = Integer.parseInt(arr[i]);
            nums[i] = tmp;
        }
        return nums;
    }

}
