package ms.m2017;

import java.util.Scanner;

/**
 * 2017微软秋季校园招聘在线编程笔试-1
 *
 * @author Heroin X
 * @date 2020/3/24 21:08
 */
public class ShorteningSequence1399 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] nums = new int[len];
        int count = 0;
        for(int i = 0; i < len; i++){
            nums[i] = sc.nextInt();
            if(nums[i]%2==0){
                count++;
            }else{
                count--;
            }
        }
        count = count>0 ? count : -count;
        System.out.println(count);

//        int shorten = shorten(len, nums);
//        System.out.println(shorten);
    }

    public static int shorten(int len,int[] nums){
//        int even = 0, odd = 0;
        int count = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] % 2 == 0){
                count++;
            }else{
                count--;
            }
        }
        return count>0 ? count:-count;
    }
}
