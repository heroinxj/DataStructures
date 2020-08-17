package offer2.array;

/**
 * @author Heroin X
 * @date 2020/6/23 22:51
 */
public class Search53 {


    // class Solution {
//     public int search(int[] nums, int target) {
//         int first = getFirst(nums, target, 0, nums.length-1);
//         int last = getLast(nums, target, 0, nums.length-1);
//         return last - first + 1;
//     }

//     public int getFirst(int[] nums,int target, int start, int last){

//         int mid = (start + last) /2;
//         if(nums[mid] == target){
//             if(nums[mid-1] == target){
//                 getFirst(nums, target, start, mid);
//             }else{
//                 return mid;
//             }
//         }else if(nums[mid] > target){
//             getFirst(nums, target, start, mid);
//         }else{
//             getFirst(nums,target, mid+1, last);
//         }
//         return 0;
//     }

//     public int getLast(int[] nums,int target, int start, int last){

//         int mid = (start + last) /2;
//         if(nums[mid] == target){
//             if(nums[mid+1] == target){
//                 getLast(nums, target, start, mid);
//             }else{
//                 return mid;
//             }
//         }else if(nums[mid] > target){
//             getFirst(nums, target, start, mid);
//         }else{
//             getFirst(nums,target, mid+1, last);
//         }
//         return 0;
//     }
// }
    public static void main(String[] args) {
        int[] arr = new int[]{2,2};
        new Search53().search(arr,2);

    }


    public int search(int[] nums, int target) {
        int left = leftIndex(nums, target, 0, nums.length-1);
        int right = rightIndex(nums, target, 0, nums.length-1);
        if( left == -1 || right == -1){
            return 0;
        }
        int count = right-left+1;
        return count;
    }

    public int leftIndex(int[] nums, int target, int start, int end){
        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target ){
                if(mid>0 && nums[mid-1] == target){
                    end = mid;
                }else{
                    return mid;
                }

            }else if(nums[mid] > target){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public int rightIndex(int[] nums, int target, int start, int end){

        while(start < end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                if(nums[mid+1] == target){
                    start = mid + 1;
                }else{
                    return mid;
                }
            }else if(nums[mid] > target){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }

}
