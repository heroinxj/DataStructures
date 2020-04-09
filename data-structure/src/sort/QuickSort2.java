package sort;

import java.util.Arrays;

/**
 * @author Heroin X
 * @date 2020/3/27 21:20
 */
public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{8,9,1,7,2,3,5,4,6,0};
//        int[] arr = new int[]{5,4,3,7,8,2};
        new QuickSort2().quick(arr,0,9);
        System.out.println(Arrays.toString(arr));
    }

    public void quick(int[] arr, int left, int right){
        if(left<right){
            int paviotIndex = quickSort2(arr, left, right);
            quick(arr, left, paviotIndex-1);
            quick(arr, paviotIndex+1, right);
        }
    }

    /**
     * 单边扫描1
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private int quickSort1(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left+1;
        for (int j = i; j <= right; j++){
            if(arr[j]<pivot){
                if(j!=i){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
                i++;
            }
        }
        i--;
        arr[left] = arr[i];
        arr[i] = pivot;
        return i;
    }

    /**
     * 单边扫描优化
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private int quickSort11(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        for (int j = i+1; j <= right; j++){
            // 主要作用是中间有较大的元素，之后会交换位置起作用
            if(arr[j]<pivot){
                i++;//!
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;

            }
        }
        arr[left] = arr[i];
        arr[i] = pivot;
        return i;
    }

    /**
     * 双边扫描
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private int quickSort2(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right;

        while ( i <= j){

            while (i <= j && arr[i] <= pivot){
                i++;
            }

            while (i <= j && arr[j] >= pivot){
                j--;
            }

            // !
            if (i>=j){
                break;
            }

            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
        }

        arr[left] = arr[j];
        arr[j] = pivot;
        return j;
    }
}
