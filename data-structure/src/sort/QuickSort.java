package sort;

import java.util.Arrays;

/**
 * @author Heroin X
 * @date 2020/3/21 16:50
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8,9,1,7,2,3,5,4,6,0};
        new QuickSort().quickSort2(arr, 0, 9);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 双边扫描 1-1
     * @param arr
     * @param left
     * @param right
     */
    public void quickSort2(int[] arr, int left, int right){

        if(left < right){
            int pivotIndex = quick2(arr, left, right);
            quickSort2(arr, left, pivotIndex - 1);
            quickSort2(arr, pivotIndex + 1, right);
        }
    }

    /**
     * 双边扫描 1-2
     * @param arr
     * @param left
     * @param right
     * @return
     */
    private int quick2(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;
        int j = right;

        while (true){
            while ( i <= j && arr[i] <= pivot){
                i++;
            }

            while ( i <= j && arr[j] >= pivot){
                j--;
            }

            if(i >= j){
                break;
            }

            // 指针卡住了，交换一下位置，继续
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        // j 已经移到到 i的左边了
        arr[left] = arr[j];
        arr[j] = pivot;
        return j;
    }


    public void quickSort1(int[] arr, int left, int right){

        if(left < right){
            int pivotIndex = quick1(arr, left, right);
            quickSort1(arr, left, pivotIndex - 1);
            quickSort1(arr, pivotIndex + 1, right);
        }
    }

    private int quick1(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left;

        for(int j = left + 1; j <= right; j++){
            if(arr[j] < pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;

            }
        }

        arr[left] = arr[i];
        arr[i] = pivot;
        return i;
    }


}
