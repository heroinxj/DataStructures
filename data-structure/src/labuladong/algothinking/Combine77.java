package labuladong.algothinking;

import java.util.ArrayList;
import java.util.List;

/**
 * LC-77 组合-M
 *
 * @author Heroin X
 * @date 2020/8/13 10:21
 */
public class Combine77 {

    public static void main(String[] args) {
        List<List<Integer>> combine = new Combine77().combine(4, 2);
        System.out.println(combine);
    }

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(1, n, k, new ArrayList<>());
        return res;
    }

    public void backtrack(int index, int n, int k, List<Integer> track){
        if (track.size() == k){
            res.add(new ArrayList<>(track));
            return;
        }

        for (int i = index; i <= n; i++){
            track.add(i);
            backtrack(i+1, n, k, track);
            track.remove(track.size()-1);
        }
    }
}
