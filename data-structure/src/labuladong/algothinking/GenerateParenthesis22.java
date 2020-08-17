package labuladong.algothinking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Heroin X
 * @date 2020/8/13 15:33
 */
public class GenerateParenthesis22 {
    public static void main(String[] args) {
        List<String> strings = new GenerateParenthesis22().generateParenthesis(3);
        System.out.println(strings);
    }

    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder track = new StringBuilder();
        backtrack(n, n, track);
        return res;
    }

    public void backtrack(int left, int right, StringBuilder track){
        if (right < left){
            return;
        }
        if (left<0 || right <0){
            return;
        }
        if (left==0 && right==0){
            res.add(new String(track));
            return;
        }

        track.append('(');
        backtrack(left-1, right, track);
        track.deleteCharAt(track.length()-1);

        track.append(')');
        backtrack(left, right-1, track);
        track.deleteCharAt(track.length()-1);

    }
}
