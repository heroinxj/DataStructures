package offer.c2p3;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 面试题3-1：数组中的重复数字（P39）
 *     长度为n，数值分布在0和n-1之间
 *
 * @author Heroin X
 * @date 2019/11/25 13:34
 */
public class DuplicateNum {
    public static void main(String[] args) {
        int[] arr={6,1,2,3,1,0,2,5,3};
        int[] arr1={1,2,3,4,0,2,5,3};
//        new DuplicateNum().test1(arr);
//        new DuplicateNum().test2(arr);
//        new DuplicateNum().test3(arr);
       // new DuplicateNum().test5(arr);
//

//        new DuplicateNum().test2(arr1);
//        new DuplicateNum().test3(arr1);
//        new DuplicateNum().test4(arr1);
        new DuplicateNum().test5(arr1);
    }


    /**
     * 1.排序后再进行查找
     * @param array
     */
    public void test1(int[] array){
        Arrays.sort(array);
        for (int i=0;i<array.length-1;i++){
            if (array[i]==array[i+1]){
                System.out.println(array[i]+" ");
            }
        }
        System.out.println("-------end-1-------");
    }

    /**
     * 2.利用hashSet的无重复元素特性
     * @param array
     */
    public void test2(int[] array){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i=0;i<array.length;i++){
            if (hashSet.contains(array[i])){
                System.out.println(array[i]);
            }else {
                hashSet.add(array[i]);
            }
        }
        System.out.println("-------end-2-------");
    }


    /**
     * 3.利用数组下标位置的特性，
     *  基本条件——长度为n，数值分布在0和n-1之间，否则有空指针异常问题出现
     *  继续思考！
     *  --------------会多找----有bug
     *
     * @param array
     */
    public void test3(int[] array){
        //本应该下标一一对应，但是有重复元素就会改变这种情况
        for (int i=0;i<array.length;i++){
            while (i!=array[i]){
                if (array[i]==array[array[i]]){
                    //找到一个，跳出循环
                    System.out.println(array[i]);
                    break;
                }else {
                    //换个顺序，从当前位置-重新开始,第一次出错了！
                    int temp=array[i];
                    array[i]=array[temp];
                    array[temp]=temp;
                    //递归，但是不能再一次排序,换个方法—> while循环！！！
                }
            }
        }
        System.out.println("------end-3------");
    }

    /**
     * 同test3，改进
     * @param array
     */
    public void test4(int[] array){
        for (int i=0;i<array.length;i++){
            while (i!=array[i]){
                int j=array[i];
                if (array[i]==array[j]){
                    //找到一个，跳出循环
                    System.out.println(array[i]);
                    break;
                }else {
                    //换个顺序，从当前位置-重新开始,第一次出错了！
                    //int temp=array[i];
                    array[i]=array[j];
                    array[j]=j;
                    //递归，但是不能再一次排序,换个方法—> while循环！！！
                }
            }
        }
        System.out.println("------end-4------");
    }

    /**
     * 重写
     * @param arr
     */
    public void test5(int[] arr){
       int a=8;
       String a1="ddd";
       a1.length();

        for (int i=0;i<arr.length;i++){
            while (i!=arr[i]) {
                if (arr[i]==arr[arr[i]]){
                    System.out.println(arr[i]);
                    break;
                }else {
                    //不等于，元素回归
                    int j=arr[i];
                    arr[i]=arr[j];
                    arr[j]=j;
                }
            }
        }
        System.out.println("----test5-----");
    }


}
