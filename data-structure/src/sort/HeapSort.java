package sort;

import java.util.Arrays;

/**
 * @author Heroin X
 * @date 2020/3/30 15:46
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,1,4,7,2,6};
        new HeapSort().heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 堆排序
     * @param arr
     */
    public void heapSort(int[] arr){
        int len = arr.length;
        for (int i = (len - 2)/2; i >=0; i--){
            downAdjust(arr, i, len);
        }
        for (int i = len - 1; i > 0; i--){
            int tmp =arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            downAdjust(arr,0, i);
        }
    }

    /**
     * 下沉 -最大堆
     * @param arr
     * @param parIndex
     * @param len
     */
    private void downAdjust(int[] arr, int parIndex, int len) {
        int tmp = arr[parIndex];
        int chl = parIndex * 2 + 1;
        while (chl < len){
            if(chl + 1 < len && arr[chl+1] > arr[chl]){
                chl++;
            }

            if (tmp >= arr[chl]){
                break;
            }
            // 不需要真正的交换，单向赋值即可
            arr[parIndex] = arr[chl];
            // 新的parentIndex
            parIndex  = chl;
            // 新的childrenIndex
            chl = 2 * parIndex + 1;
//            chl = 2 * chl + 1;
        }
        arr[parIndex] = tmp;
    }
}
