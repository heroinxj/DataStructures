package offer2.heap;

import java.util.Arrays;

/**
 * 二叉堆
 *
 * 二叉堆本质上就是一个完全二叉树，主要分为最大堆和最小堆
 * 二叉堆的自我调整包括，
 *      插入结点；按行插入最后一个位置
 *      删除结点；删除顶部结点，同时让尾部最后一个结点移到顶部位置，再对其进行一个自我调整
 *              针对结点下沉，结点是和左右两个子结点中的较小的进行比较，如果较小的比父结点小，则交换位置，最大堆同理。
 *
 *      构建二叉堆：从最后一个非叶子结点开始，然后按照S形进行排列；高层的结点下沉之后到新位置时，仍需要和下一级进行比较(即有叶子结点的情况下)
 * @author Heroin X
 * @date 2020/5/21 9:39
 */
public class BinaryHeap {
    public static void main(String[] args) {

        int[] arr =new int[]{4,5,2,3,1,6,10,9,7,8};
        int len = arr.length;
        for (int i = (len-2)/2; i >= 0; i--){
            new BinaryHeap().downAdjust(arr, i, len);
        }

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 下沉，最小堆
     *
     * @param arr
     * @param parIndex
     * @param len
     */
    public void downAdjust(int[] arr, int parIndex, int len){
        int tmp = arr[parIndex];
        int charIndex = 2 * parIndex + 1;

        while (charIndex < len){

            // find the min one
            if (charIndex+1 < len && arr[charIndex] > arr[charIndex+1]){
                charIndex++;
            }
            // if tmp < char !!!
            if (tmp <= arr[charIndex]){
                break;
            }

            arr[parIndex] = arr[charIndex];
            parIndex = charIndex;
            charIndex = 2 * charIndex + 1;
        }

        // 最后交换的点位置适中都是parent
        arr[parIndex] = tmp;
    }

    /**
     * 上浮，适合插入点，最后一个位置。
     * @param arr
     */
    public void upAdjust(int[] arr){
        int len = arr.length;
        int charIndex = len-1;
        int parIndex = (charIndex-1)/2;
        int tmp = arr[charIndex];

        while (charIndex > 0 && tmp > arr[parIndex]){
            arr[charIndex] = arr[parIndex];
            charIndex = parIndex;
            parIndex = (parIndex-1)/2;
        }

        // 此时的charIndex 就是parIndex;但是parIndex已经越界了  parIndex = (parIndex-1)/2;
        arr[charIndex] = tmp;

    }

}
