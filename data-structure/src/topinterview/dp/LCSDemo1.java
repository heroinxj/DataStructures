package topinterview.dp;

/**
 * 最长公共子序列
 *
 * @author Heroin X
 * @date 2020/5/14 22:03
 */
public class LCSDemo1 {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "acde";
        int i = new LCSDemo1().longestCommonSubsequence(s1, s2);
        System.out.println(i);
    }

    public int  longestCommonSubsequence(String text1, String text2) {
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int length1 = t1.length;
        int length2 = t2.length;
        int[][] dp = new int[length1+1][length2+1];
        for (int i = 1; i < length1 +1; i++) {
            for (int j = 1; j < length2 +1; j++) {
                if (t1[i-1] == t2[j-1]){
                    // 这边找到一个 lcs 的元素，继续往前找
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else {
                    //谁能让 lcs 最长，就听谁的
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[length1][length2];
    }
}
