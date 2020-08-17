package labuladong.algothinking;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Heroin X
 * @date 2020/8/12 20:56
 */
public class Permute2 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        recall(nums, res, new LinkedList<>());
        return res;
    }

    public void recall(int[] nums, List<List<Integer>> res, LinkedList<Integer> list){
        if(list.size() == nums.length){
            res.add(new LinkedList<>(list));
        }

        for(int i = 0; i < nums.length; i++){
            if (!list.contains(nums[i])){
                list.add(nums[i]);
                recall(nums, res, list);
                list.removeLast();
            }
        }
    }

    
}
