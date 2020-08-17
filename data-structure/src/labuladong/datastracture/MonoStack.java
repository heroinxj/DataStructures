package labuladong.datastracture;

import java.util.Arrays;
import java.util.Stack;

/**
 * 单调栈
 *
 * @author Heroin X
 * @date 2020/8/12 9:21
 */
public class MonoStack {

    public static void main(String[] args) {
        MonoStack monoStack = new MonoStack();
        int[] demo1 = new int[]{2,1,2,4,3};
        int[] res1 = monoStack.nextBigNum(demo1);
        System.out.println(Arrays.toString(res1));

        int[] demo2 = new int[]{73,74,75,71,69,72,76,73};
        int[] res2 = monoStack.afterFewDays(demo2);
        System.out.println(Arrays.toString(res2));


    }

    /**
     * 下一个更大的数字是什么
     * {2,1,2,4,3}
     * [4, 2, 4, -1, -1]
     *
     * @param nums
     * @return
     */
    public int[] nextBigNum(int[] nums){
        int len = nums.length;
        int[] res = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i=len-1; i>=0; i--){
            while (!stack.isEmpty() && stack.peek() <= nums[i]){
                stack.pop();
            }
            res[i] = stack.isEmpty() ? -1:stack.peek();
            stack.push(nums[i]);
        }
        return res;
    }

    /**
     * 几天之后温度更高
     * {73,74,75,71,69,72,76,73}
     * [1, 1, 4, 2, 1, 1, 0, 0]
     *
     * @param nums
     * @return
     */
    public int[] afterFewDays(int[] nums){
        int len = nums.length;
        int[] res = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = len-1; i >= 0; i--){
             while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]){
                 stack.pop();
             }
             res[i] = stack.isEmpty()?0:(stack.peek()-i);
             stack.push(i);
        }
        return res;
    }

}
