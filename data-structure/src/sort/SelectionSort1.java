package sort;

/**
 * @author Heroin X
 * @date 2020/3/20 21:24
 */
public class SelectionSort1 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,5,7,2,8,3};
        int[] select = new SelectionSort1().select(arr1);
        System.out.println(select);
    }

    public int[] select(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            //int index = i;
            for(int j = i + 1; j < len; j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

    public int[] select2(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            int index = i;
            for(int j = i + 1; j < len; j++){
                if(arr[index] > arr[j]){
                    index = j;
                }
            }
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }

        return arr;
    }
}
