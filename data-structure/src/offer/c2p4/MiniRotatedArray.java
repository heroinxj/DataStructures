package offer.c2p4;

/**
 * 2.4.2  查找和排序
 *
 * 面试题11：旋转数组的最下数字
 *      输入一个递增数组的 旋转数组（左侧若干个元素移到右边），输出该数组的最小值
 *
 *      多多利用指针的思想
 * @author Heroin X
 * @date 2019/12/21 18:54
 */
public class MiniRotatedArray {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        int[] arr2={5,1,2,3,4};
        int[] arr3={1,2,3,4,5};
        int miniElement = getMiniElement(arr, 0, arr.length - 1);
        int miniElement2 = getMiniElement(arr2, 0, arr.length - 1);
        int miniElement3 = getMiniElement(arr3, 0, arr.length - 1);
//        System.out.println(miniElement);
        System.out.println(miniElement2);
        System.out.println(miniElement3);
    }

    static int getMiniElement(int[] arr,int start,int end){
        if (start>=end){
            return -1;
        }

        if (arr[start]<arr[end]){
            return arr[start];
        }

        if ((end-start)==1){
            return arr[end];
        }

        //易错点
//        int i=Math.round((end-start)/2-1);
        int i=Math.round((end+start)/2);

        if (arr[i]>arr[start]){
            //则说明最小元素在后半段
            return getMiniElement(arr,i,end);
        }else {
            //则说明最小元素在前半段
            return getMiniElement(arr,start,i);
        }
    }
}
