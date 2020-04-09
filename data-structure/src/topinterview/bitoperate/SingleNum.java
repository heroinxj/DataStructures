package topinterview.bitoperate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Heroin X
 * @date 2020/2/3 21:55
 */
public class SingleNum {

    public int singleNumber(int[] nums) {
        List<Integer> list  = new ArrayList<>();
        for(int num : nums){
            if(!list.contains(num)){
                list.add(num);
            }else{
                list.remove(num);
            }
        }

        return list.get(0);

    }

//    public int singleNumber2(int[] nums) {
//        HashMap<Integer, Object> hash = new HashMap<>();
//        for(int num: nums){
//            if(hash.containsKey(num)){
//                hash.remove(num);
//            }else{
//                hash.put(num,num);
//            }
//        }
//
//
//        //return hash.get();
////        Integer.toBinaryString();
//
//    }
}
