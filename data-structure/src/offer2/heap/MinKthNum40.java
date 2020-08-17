package offer2.heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 面试题40-最小的K个数-E
 * @author Heroin X
 * @date 2020/5/21 9:37
 */
public class MinKthNum40 {
    public static void main(String[] args) {
        int[] arr =new int[]{4,5,2,3,1,6,10,9,7,8};
        int[] leastNumbers = new MinKthNum40().getLeastNumbers(arr, 4);
        System.out.println(Arrays.toString(leastNumbers));
    }

    /**
     * 最小优先队列，保持k个，一一比较，
     * @param arr
     * @param k
     * @return
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int i = 0; i < arr.length; i++){
            queue.offer(i);
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++){
            res[i] = queue.poll();
        }

        return res;
    }
}
