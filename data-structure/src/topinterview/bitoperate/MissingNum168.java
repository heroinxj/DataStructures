package topinterview.bitoperate;

import java.util.HashMap;

/**
 * @author Heroin X
 * @date 2020/2/4 15:33
 */
public class MissingNum168 {

    public int missingNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int num: nums){
            hash.put(num, 1);
        }

        for(int i=0; i<hash.size(); i++){
            if(hash.get(i)==0){
                return i;
            }
        }

        return 0;
    }
}
