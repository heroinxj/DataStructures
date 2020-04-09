package topinterview.array;

/**
 * @author Heroin X
 * @date 2020/2/11 16:57
 */
public class SearchRange34 {
    public static void main(String[] args) {
        int[] arr =new int[1];
        int[] ints = new SearchRange34().searchRange(arr, 1);
        System.out.println(ints);
    }
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            if(res[0]==0 && target == nums[i]){
                res[0]=res[1] = i;
                if(i+1 >= nums.length){
                    i++;
                }
            }

            if(target ==nums[i]){
                res[1]=i;
            }
        }

        if(res[0]==0 && res[1]==0){
            res[0]=res[1]=-1;
        }

        return res;
    }
}
