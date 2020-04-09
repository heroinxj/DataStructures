package nowcoder.string;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * 面试题19 正则表达式匹配
 *
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 *
 * @author Heroin X
 * @date 2019/12/30 9:42
 */
public class MatchRegix {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }
        int strIndex = 0;
        int patternIndex = 0;
        return matchCore(str, strIndex, pattern, patternIndex);
    }


    public boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(stack.pop());
        //有效性检验：str到尾，pattern到尾，匹配成功
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }

        //pattern先到尾，匹配失败 ?
        if (strIndex != str.length && patternIndex == pattern.length) {
            return false;
        }

        //模式第2个是*，且字符串第1个跟模式第1个匹配,分3种匹配模式；如不匹配，模式后移2位
        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            if ((strIndex != str.length && pattern[patternIndex] == str[strIndex])
                    || (pattern[patternIndex] == '.' && strIndex != str.length)) {
                //模式后移2，视为x*匹配0个字符
                return matchCore(str, strIndex, pattern, patternIndex + 2)
                        //视为模式匹配1个字符
                        || matchCore(str, strIndex + 1, pattern, patternIndex + 2)
                        //*匹配1个，再匹配str中的下一个
                        || matchCore(str, strIndex + 1, pattern, patternIndex);
            } else {
                return matchCore(str, strIndex, pattern, patternIndex + 2);
            }
        }

        //模式第2个不是*，且字符串第1个跟模式第1个匹配，则都后移1位，否则直接返回false
        if ((strIndex != str.length && pattern[patternIndex] == str[strIndex])
                || (pattern[patternIndex] == '.' && strIndex != str.length)) {
            return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
        }
        return false;
    }

    /*******************************************************************/


//    public static boolean match(char[] str, char[] pattern)
//    {
//        if(str == null || pattern == null)
//            return false;
//        return match(str, 0, pattern, 0);
//    }
//
//
//    private  boolean match(char[] str, int i, char[] pattern, int j) {
//        if(j == pattern.length)//pattern遍历完了
//            return str.length == i;//如果str也完了，返回true，不然false
//        //注意数组越界问题，一下情况都保证数组不越界
//
//        if(j < pattern.length - 1 && pattern[j + 1] == '*') {//下一个是*
//
//            //当前匹配  //匹配
//            if(str.length != i && (str[i] == pattern[j] || pattern[j] == '.'))
//                return match(str,i,pattern,j + 2) || match(str,i + 1,pattern,j);
//
//            else//当前不匹配
//                return match(str,i,pattern,j + 2);
//        }
//
//        //下一个不是“*”，当前匹配
//        if(str.length != i && (str[i] == pattern[j] || pattern[j] == '.'))
//            return match(str,i + 1,pattern,j + 1);
//        return false;
//    }


}