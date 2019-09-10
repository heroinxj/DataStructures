package c4recursion.linkedwithrecursion;

/**
 * @author Heroin X
 * @date 2019/9/6 14:01
 */
public class Sum{

    public static int sum(int[] arr){
        return sum(arr,0);
    }

    /**
     * 计算arr[l,,,n)这个区间内的所有数字之和，
     * 把握这个函数的基本意义，即从l开始计算arr, 宏观语义的重要性，不要被递归干扰
     *     因为从A 函数调用A函数，所以是递归。
     *
     * @param arr 数组arr
     * @param l 从L开始
     * @return 求和
     */
    private static int sum(int[] arr,int l){
        // 求解最基本的问题
        if (l==arr.length){
            return 0;
        }

        // 核心--把原问题转化为更小的问题
        return arr[l]+sum(arr,l+1);
    }

}
