package topinterview;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Heroin X
 * @date 2020/3/18 16:59
 */
public class DemoTest {
    public static void main(String[] args) {

        int[][] arr2 = new int[][]{{1, 3}, {3, 5}, {2, 7}, {6, 9}};
        Arrays.sort(arr2, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });


        Arrays.sort(arr2, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return 0;
            }
        });


        Integer[] arr1 = new Integer[]{3,4,1,5,7};
        Arrays.sort(arr1,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });


        // 跳出循环
        int[][] arr = new int[][]{{1,2,3},{2,0,4},{3,2,6}};
        boolean flag =false;
        for(int i = 0; i< 3 ; i++){
            for(int j = 0; j < 3; j++){
                if(arr[i][j] == 0){
                    break;
                }
            }
        }


        for(int i = 0; i< 3 && !flag; i++){
            for(int j = 0; j < 3 && !flag; j++){
                if(arr[i][j] == 0){
                    flag = true;
                }
            }
        }
    }





}
