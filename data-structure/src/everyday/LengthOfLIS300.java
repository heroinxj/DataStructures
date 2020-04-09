package everyday;

import java.util.Arrays;

/**
 * 300-M-最长上升子序列
 * 给定一个无序的整数数组，找到其中最长上升子序列的长度。
 *
 * @author Heroin X
 * @date 2020/3/14 11:24
 */
public class LengthOfLIS300 {

    public static void main(String[] args) {
        int[] arr = new int[]{10,9,2,5,3,7,101,18};
        new LengthOfLIS300().lengthOfLIS(arr);
    }

    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return len;
        }

        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < len; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

}
