package day200815;

import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/8/15 19:41
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] split = sc.nextLine().trim().split(" ");
        int[] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = Integer.parseInt(split[i]);
        }
        sort1(nums, 0, nums.length-1);
        for (int i=0; i<n-1;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print(nums[n-1]);
    }

    public static void sort1(int[] arr, int left, int right){

        if(left < right){
            int pivotIndex = sort2(arr, left, right);
            sort1(arr, left, pivotIndex - 1);
            sort1(arr, pivotIndex + 1, right);
        }
    }

    public static int sort2(int[] arr, int left, int right){
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

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        arr[left] = arr[j];
        arr[j] = pivot;
        return j;
    }

}
