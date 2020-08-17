package offer2.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 滑动窗口-59-1-E
 *
 * @author Heroin X
 * @date 2020/6/9 16:44
 */
public class MaxSlidingWindow59 {

    public int[] maxSlidingWindow1(int[] nums, int k) {
        // List<Integer> list = new ArrayList<>();

        int len = nums.length;

        if(len ==0){
            return new int[0];
        }
        int[] arr = new int[len-k+1];
        int index = -1;
        int tmp = Integer.MIN_VALUE;

        for(int i = 0; i < len - k + 1; i++){
            int j =0;
            if(i > index){
                tmp= nums[i];
                j = i;
            }else{
                tmp = nums[index];
                j = index;
            }

            for( ; j < i+k; j++ ){
                if(nums[j] >= tmp ){
                    tmp = nums[j];
                    index= j;
                }
            }
            arr[i]=tmp;
        }

        return arr;
    }

    public int[] maxSlidingWindow2(int[] nums, int k) {

        if(nums.length == 0 || nums== null){
            return new int[0];
        }

        int len = nums.length - k + 1;
        Deque<Integer> deque = new ArrayDeque<>();
        int[] res  = new int[len];
        int j = 0;
        for(int i = 0; i < nums.length; i++){

            // 从尾部比较并删除，体现出双端队列的优势,
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i]){
                deque.pollLast();
            }

            while(!deque.isEmpty() && deque.peek() < i - k +1){
                deque.poll();
            }

            deque.offer(i);

            // error: res[j++] = deque.peek();
            if(i >= k-1){
                res[j++] = nums[deque.peek()];
            }
        }

        return res;
    }
}
