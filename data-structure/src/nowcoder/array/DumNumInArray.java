package nowcoder.array;

import java.util.Arrays;

/**
 *
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 *
 * @author Heroin X
 * @date 2019/12/27 15:09
 */
public class DumNumInArray {
    public static void main(String[] args) {
        int[] ints = new int[5];
        if (ints==null){
            System.out.println("null");
        }
    }

    /**
     *
     * @param numbers an array of integers
     * @param length the length of array numbers
     * @param duplication (Output) the duplicated number in the array number,length of duplication array is 1,
     *                    so using duplication[0] = ? in implementation;
     * @return
     */
    public boolean duplicate(int numbers[],int length,int [] duplication) {

        if(numbers==null){
            duplication[0]=-1;
            return false;
        }

        Arrays.sort(numbers);
        for (int i=0;i<length-1;i++){
            if (numbers[i]==numbers[i+1]){
                System.out.println(numbers[i]);
                return true;
            }
        }
        return false;
    }
}
