package offer2.stack;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 48-M-最长不含重复字符的子字符串
 *
 * @author Heroin X
 * @date 2020/6/2 20:24
 */
public class LongestSubstring48 {

    public static void main(String[] args) {
        int i = new LongestSubstring48().lengthOfLongestSubstring3("pwwkew");
        System.out.println(i);
    }


    /**
     * 我的解法——bug
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s=="" ){
            return -1;
        }
        int len = s.length();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = s.charAt(i)-'a';
        }

        int maxLen = 0;
        int count=0;
        HashSet set = new HashSet<Integer>();
        for(int j = 0; j < len; j++){
            if(set.contains(arr[j])){
                set.remove(arr[j]);
                count--;
            }
            set.add(arr[j]);
            count++;
            if(count > maxLen){
                maxLen = count;
            }
        }
        return maxLen;
    }

    public int lengthOfLongestSubstring2(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //最长子串长度
        int max = 0;
        //滑动窗口左下标，i相当于滑动窗口右下标
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            //charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
            if(map.containsKey(s.charAt(i))){
                //map.get():返回字符所对应的索引，当发现重复元素时，窗口左指针右移
                //map.get('a')=0,因为map中只有第一个a的下标，然后更新left指针到原来left的的下一位
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            //再更新map中a映射的下标
            map.put(s.charAt(i),i);
            //比较两个参数的大小
            max = Math.max(max,i-left+1);
        }
        return max;

    }

//    作者：powcai
//    链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/solution/hua-dong-chuang-kou-by-powcai/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    public int lengthOfLongestSubstring3(String s) {

        int p1 = 0;
        int p2 = 0;
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        while(p2 < s.length()){
            if(!set.contains(s.charAt(p2))){
                set.add(s.charAt(p2));
                p2++;
                max = Math.max(max, set.size());
            }else{
                set.remove(s.charAt(p1));
                p1++;
            }

        }

        return max;
    }
}
