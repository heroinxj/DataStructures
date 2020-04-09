package topinterview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Heroin X
 * @date 2020/2/10 11:51
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int[] arr =new int[2];
        int a = arr[0];
        List<List<Integer>> lists = new ThreeSum().threeSum(nums);
        System.out.println(lists);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null ||nums.length <3){
            return res;
        }

        Arrays.sort(nums);
        int p1, p2, p3;
        for(int i = 0; i < nums.length; i++){
            p1 = i;
            p2 = i+1;
            p3 = nums.length-1;

            if(nums[i] > 0){
                break;
            }

            if( i>0 && nums[p1] == nums[p1-1]){
                continue;
            }

            while(p2 < p3){
                int sum = nums[p1] + nums[p2] +nums[p3];
                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[p1]);
                    list.add(nums[p2]);
                    list.add(nums[p3]);
                    res.add(list);

                    while(p2 < p3 && nums[p2] == nums[p2+1]){
                        p2++;
                    }
                    while(p2 < p3 && nums[p3] == nums[p3-1]){
                        p3--;
                    }
                    p2++;
                    p3--;
                }else if(sum < 0){
                    p2++;
                }else if(sum > 0){
                    p3--;
                }
            }
        }

        return res;
    }
}
