package sort;

/**
 * 冒泡排序
 *      （1）普通的冒泡排序
 *      （2）优化1
 *      （3）优化2
 *
 * @author Heroin X
 * @date 2020/3/20 12:09
 */
public class BubbleSort1 {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1,5,7,2,8,3};
        int[] res1 = new BubbleSort1().bubbleSortDec(arr1);
        System.out.println("res1 "+res1);

        int[] res2 = new BubbleSort1().bubbleSortInc(arr1);
        System.out.println("res2 "+res2);

        int[] arr2 = new int[]{1,5,7,2,8,3};
        int[] res3 = new BubbleSort1().bubbleSortInc2(arr2);
        System.out.println(res3);

        int[] arr3 = new int[]{1,5,7,2,8,3};
        int[] res4 = new BubbleSort1().bubbleSortInc3(arr3);
        System.out.println(res4);

    }

    /**
     * 降序
     * @param arr
     * @return
     */
    public int[] bubbleSortDec(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len - i - 1; j++){
                if(arr[j] < arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;
    }

    /**
     * 升序
     * @param arr
     * @return
     */
    public int[] bubbleSortInc(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        return arr;
    }

    /**
     * 冒泡升序-优化1
     * @param arr
     * @return
     */
    public int[] bubbleSortInc2(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            // 默认已经排好序了
            boolean isSort = true;
            for(int j = 0; j < len -  i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    isSort = false;
                }
            }

            if(isSort){
                break;
            }
        }

        return arr;
    }

    /**
     * 冒泡升序-优化2
     * @param arr
     * @return
     */
    public int[] bubbleSortInc3(int[] arr){
        int len = arr.length;
        int index = 0;
        int end = len -1;
        for(int i = 0; i < len; i++){
            // 默认是已经排好序了
            boolean isSort = true;
            for(int j = 0; j < end; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    index = j;
                    isSort = false;
                }
            }
            end = index;
            if(isSort){
                break;
            }
        }

        return arr;
    }


}
