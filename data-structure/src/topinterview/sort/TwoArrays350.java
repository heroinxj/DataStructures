package topinterview.sort;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Heroin X
 * @date 2020/2/2 21:51
 */
public class TwoArrays350 {
    public int[] intersect(int[] nums1, int[] nums2){
        if(nums1.length < nums2.length){
            return intersect(nums2, nums1);
        }

        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int n:nums1){
            hash.put(n, hash.getOrDefault(n,0)+1);
        }
        int k=0;

        for(int n:nums2){
            int cnt = hash.getOrDefault(n,0);
            if(cnt > 0){
                nums1[k++] = n;
                hash.put(n, cnt-1);
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
