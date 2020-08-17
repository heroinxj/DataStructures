package labuladong.algothinking;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 *
 * @author Heroin X
 * @date 2020/8/13 9:19
 */
public class Subset78 {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> subsets = new Subset78().subsets(arr);
        System.out.println(subsets);
    }

//    List<List<Integer>> res ;
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0, new ArrayList<>());
        return res;
    }

    public void backtrack(int[] nums, int index, List<Integer> track){


//        res.add(new ArrayList<>(track));
        res.add(track);
        for (int i = index; i < nums.length; i++){
            track.add(nums[i]);
            backtrack(nums, i+1, track);
            track.remove(track.size()-1);
        }
    }

//    class Solution {
//        public List<List<Integer>> subsets(int[] nums) {
//            List<List<Integer>> res = new ArrayList<>();
//            backtrack(0, nums, res, new ArrayList<Integer>());
//            return res;
//
//        }
//
//        private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
//            res.add(new ArrayList<>(tmp));
//            for (int j = i; j < nums.length; j++) {
//                tmp.add(nums[j]);
//                backtrack(j + 1, nums, res, tmp);
//                tmp.remove(tmp.size() - 1);
//            }
//        }
//    }
//
//    作者：powcai
//    链接：https://leetcode-cn.com/problems/subsets/solution/hui-su-suan-fa-by-powcai-5/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}
