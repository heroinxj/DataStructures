package sort;

/**
 * @author Heroin X
 * @date 2020/3/29 8:34
 */
public class SelectSort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,5,6,2,4};
        new SelectSort2().select(arr);
        System.out.println(arr.toString());
    }

    private void select(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            int index = i;
            for (int j = i; j < len; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
    }
}
