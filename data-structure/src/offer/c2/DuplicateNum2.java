package offer.c2;

import java.util.HashSet;

/**
 * 面试题3-2：不修改数组,找出重复的数字（P41）
 *      长度n+1,在1和n之间分布
 *
 * @author Heroin X
 * @date 2019/11/26 10:03
 */
public class DuplicateNum2 {
    public static void main(String[] args) {
        int[] array={2,3,5,4,3,2,6,7};
        //new DuplicateNum2().test1(array);
//        new DuplicateNum2().test(array);
        new DuplicateNum2().test4(array);
    }

    /**
     * 1.增加一个新的数组，复制
     *
     * @param arr
     */
    public void test1(int[] arr){
        int len=arr.length;
        int[] arr2=new int[len];
        for (int i=0;i<len;i++){
            int j = arr[i];
            //假如有0元素就不行了-_-
            if (arr2[j]==0){
                arr2[j]=j;
            }else {
                //找到一个重复的值了
                System.out.println(j);
            }
        }
    }

    /**
     * 2.二分思想
     *
     * @param arr
     */
    public void test2(int[] arr){
        int len=arr.length;
        int[] arr2=new int[len];
    }

    /**
     * 重写
     * @param arr
     */
    public void test3(int[] arr){
        int[] array=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            if (array[arr[i]]!=0){
                System.out.println(arr[i]);
            }else {
                array[arr[i]]=arr[i];
            }
        }
    }

    /**
     * hashSet
     *
     * @param arr
     */
    public void test4(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if (hashSet.contains(arr[i])){
                System.out.println(arr[i]);
            }else {
                hashSet.add(arr[i]);
            }
        }
    }


}
