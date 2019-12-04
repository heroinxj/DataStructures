package offer.c2;

/**
 * 面试题5-关联题：合并数组，排序
 * @author Heroin X
 * @date 2019/11/28 11:21
 */
public class MergeArraySort {
    public static void main(String[] args) {

        int[] arr1=new int[10];
        arr1[0]=1;
        arr1[1]=3;
        arr1[2]=5;
        int[] arr2={2,3,4,6};
//        new MergeArraySort().test1(arr1,arr2);
        new MergeArraySort().test2(arr1,arr2);

    }

    public void test1(int[] arr1,int[] arr2){

        int len1 = 3;
        int len2 = arr2.length;
        int len3=len1+len2;
        int i=1;
        int j=1;
        int k=1;

        while (k<len3-1&&i<len1-1&&j<len2-1){
            if (arr1[len1-i]>arr2[len2-j]){
                arr1[len3-k]=arr1[len1-i];
                i++;
                k++;
            }else if (arr1[len1-i]<arr2[len2-j]){
                arr1[len3-k]=arr2[len2-j];
                j++;
                k++;
            }else {
                arr1[len3-k]=arr1[len1-i];
                arr1[len3-k-1]=arr2[len2-j];
                i++;
                j++;
                k++;
            }
        }
        for (int f=0;i<len3;i++){
            System.out.println(arr1[i]);
        }




    }

    public void test2(int[] arr1,int[] arr2){
        int len1=0;
        int len2=0;
        for (int i=0;i<arr1.length;i++){
            if (arr1[i]!=0){
                len1++;
            }
        }
        for (int i=0;i<arr2.length;i++){
            if (arr2[i]!=0){
                len2++;
            }
        }
        int len = len1+len2;
        //判断大小，插入
        for (int i=len-1;i>0;i--){
            if (arr1[len1-1]>arr2[len2-1]){
                arr1[i]=arr1[--len1];
            }else if (arr1[len1-1]<arr2[len2-1]){
                arr1[i]=arr2[--len2];
            }else {
                arr1[i]=arr1[--len1];
                arr1[--i]=arr2[--len2];
            }
        }
        //输出数组
        for (int i=0;i<len;i++){
            System.out.println(arr1[i]);
        }
    }
}
