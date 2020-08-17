package day200816;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/8/16 19:00
 */
public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();

        int[] nums = new int[str.length()];

        for (int i = 0; i < str.length();i++){
            nums[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        Arrays.sort(nums);

        int c =nums[0];
        for (int i=1; i < nums.length-k;i++){
            c = c*10;
            c+= nums[i];
        }
        System.out.println(c);

    }
}
