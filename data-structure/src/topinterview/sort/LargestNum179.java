package topinterview.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Heroin X
 * @date 2020/2/2 11:59
 */
public class LargestNum179 {

    public static void main(String[] args) {
        int[] num = new int[]{12,3,4};
        String s = new LargestNum179().get(num);
        System.out.println(s);

    }

    String get(int[] nums){

        if(nums.length==0 ){
            return "";
        }

        String[] array = new String[nums.length];
        for(int i=0; i<array.length; i++){
            array[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1+o2;
                String s2 = o2+o1;
                return s2.compareTo(s1);
            }
        });
//
//        Comparator<Object> objectComparator = new Comparator<>() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//
//            @Override
//            public boolean equals(Object obj) {
//                return false;
//            }
//        };

//        Comparable<String> stringComparable = new Comparable<>() {
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };

        if(array[0].charAt(0)=='0'){
            return "0";
        }

        StringBuilder sb =new StringBuilder();
        for(int i=0; i<array.length; i++){
            sb.append(array[i]);
        }

        return sb.toString();
    }
}
