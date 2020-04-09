package topinterview.array;

import java.util.HashMap;

/**
 * @author Heroin X
 * @date 2020/2/8 14:47
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] res = new int[2];

        for(int i=0; i<nums.length; i++){
            if(hash.containsKey(nums[i])){
                res[0] = i;
                res[1] = hash.get(nums[i]);
                return res;
            }else{
                hash.put(target-nums[i], i);
            }
        }

        return res;
    }
}
