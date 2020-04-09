package topinterview.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Heroin X
 * @date 2020/2/14 11:07
 */
public class SubSets79 {

    public static void main(String[] args) {
        int[] res =new int[]{1,2,3};
        List<List<Integer>> subsets = new SubSets79().subsets(res);

        System.out.println(subsets);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int n : nums){
            int size = result.size();
            for(int i=0; i<size; i++){
                List<Integer> subset = new ArrayList<>(result.get(i));
                subset.add(n);
                result.add(subset);
            }
        }
        return result;
    }
}
