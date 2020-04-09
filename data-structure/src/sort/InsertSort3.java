package sort;

/**
 * @author Heroin X
 * @date 2020/3/29 8:28
 */
public class InsertSort3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,5,6,2,4};
        new InsertSort3().sort(arr);
        System.out.println(arr.toString());
    }

    public void sort(int[] arr){
        int len = arr.length;
        for (int i = 1; i < len; i++){
            int tmp = arr[i];
            int j = 0;
            for (j = i - 1; j >=0; j--){
                if (arr[j] > tmp){
                    arr[j+1] = arr[j];
                }else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
}
