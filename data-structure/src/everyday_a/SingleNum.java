package everyday_a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Heroin X
 * @date 2020/4/1 19:17
 */
public class SingleNum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,4,4,3};
        new SingleNum().singleNumber(arr);
    }

    public int singleNumber(int[] nums) {
        int len = nums.length;
        HashMap<Integer, Integer> hash = new HashMap();
        for(int num : nums){
            if(hash.containsKey(num)){
                hash.remove(num);
            }else{
                hash.put(num, 1);
            }
        }

        Set<Integer> map = hash.keySet();
        Iterator<Integer> it = map.iterator();
        return it.next();
    }
}
