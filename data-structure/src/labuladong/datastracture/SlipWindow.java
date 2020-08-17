package labuladong.datastracture;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author Heroin X
 * @date 2020/8/12 10:54
 */
public class SlipWindow {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,3,-1,-3,5,3,6,7};
        int[] arr = new int[]{1,3,1,2,0,5};
        int k = 3;
        int[] ints = new SlipWindow().maxSlidingWindow(arr, 3);
        System.out.println(Arrays.toString(ints));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length ==0 || nums.length<k){
            return new int[0];
        }
        int len = nums.length;
        int[] res = new int[len-k+1];
        int index=0;
        Deque<Integer> queue = new ArrayDeque<>();

        for(int i=0; i < len; i++){
            while(!queue.isEmpty() && (i-queue.peekFirst())>=k ){
                queue.pollFirst();
            }

            while (!queue.isEmpty() && nums[queue.peekLast()]<=nums[i]){
                queue.pollLast();
            }

            queue.offer(i);
            if ((i-index+1)>=k){
                System.out.println(i);
                res[index++] = nums[queue.peekFirst()];
            }

        }
        return res;
    }
}
