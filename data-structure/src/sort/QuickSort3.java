package sort;

/**
 * @author Heroin X
 * @date 2020/3/31 15:53
 */
public class QuickSort3 {

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        int len = nums.length;
        new QuickSort3().sort(nums, 0, len-1);
        int i=0;
        for(; i < len; i++){
            if(nums[i]==0){
                break;
            }
        }
        i--;
        int j = 0;
        while(j < i){
            int tmp = nums[i];
            nums[i] =nums[j];
            nums[j] = tmp;
            i--;
            j++;
        }
    }

    public int[] sortArray(int[] nums) {
        int len = nums.length;
        sort(nums, 0, len-1);
        return nums;
    }

    private void sort(int[] arr, int left, int right){
        if(left < right){
            int mid = quickSort(arr, left, right);
            sort(arr, left, mid-1);
            sort(arr, mid+1, right);
        }
    }

    private int quickSort(int[] arr, int left, int right){
        int tmp = arr[left];
        int i = left;
        int j = right;

        while(true){
            while(i<=j && arr[i] >= tmp){
                i++;
            }
            while(i<=j && arr[j] <= tmp){
                j--;
            }
            if(i >= j){
                break;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        arr[left] = arr[j];
        arr[j] = tmp;
        return j;
    }
}
