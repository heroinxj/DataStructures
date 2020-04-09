package sort;

/**
 * @author Heroin X
 * @date 2020/3/20 22:16
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,5,7,2,8,3};
        int[] insert = new InsertSort().insert2(arr1);
        System.out.println(insert);
    }

    public int[] insert2(int[] arr){
        int len = arr.length;
        for(int i = 1; i < len; i++){
            int tmp = arr[i];
            int j = 0;
            for( j = i - 1; j >= 0; j--){
                if(arr[j] > tmp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }

            arr[j+1] = tmp;
        }
        return arr;
    }





























    public int[] insert1(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int value = arr[i];
            int j = 0;
            for (j = i-1; j >= 0; j--) {
                if (arr[j] > value) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = value;
        }

        return arr;
    }
}
