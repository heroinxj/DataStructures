package day200418jingdong;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/4/18 14:14
 */
public class Main2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(in.hasNext()) {
            int n = Integer.parseInt(in.nextLine());
            for (int i = 0; i < n;i++){
                String a = in.nextLine();
                String[] split = a.split(" ");
                list.add(Integer.parseInt(split[0]));
                list.add(Integer.parseInt(split[1]));
            }
        }


}
}
