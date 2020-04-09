package topinterview.sort;

import java.util.Arrays;

/**
 * @author Heroin X
 * @date 2020/2/2 21:21
 */
public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        return Arrays.equals(sarr,tarr);
    }
}
