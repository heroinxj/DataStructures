package topinterview.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Heroin X
 * @date 2020/2/12 16:00
 */
public class MergeInterval56 {
    public static void main(String[] args) {
        int[][] arr = new int [][]{{1,3},{2,6},{8,10},{9,12},{15,18}};
        int[][] merge = new MergeInterval56().merge(arr);
        System.out.println(merge);
    }

    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });

        int[] inter = intervals[0];
        list.add(inter);

        for(int[] interval: intervals){
            if(inter[1] >= interval[0]){
                inter[1] = Math.max(inter[1], interval[1]);
            }else{
                inter = interval;
                list.add(inter);
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
