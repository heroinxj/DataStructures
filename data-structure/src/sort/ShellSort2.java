package sort;

/**
 * @author Heroin X
 * @date 2020/3/29 8:19
 */
public class ShellSort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,5,6,2,4};
        new ShellSort2().shell(arr);
        System.out.println(arr.toString());
    }

    public void shell(int[] arr){
        int len = arr.length;
        for (int gap = len/2; gap > 0; gap /= 2){
            for (int i = gap; i < len; i++){
                shellSort(arr, gap, i);
            }
        }
    }

    private void shellSort(int[] arr, int gap, int i) {

        int tmp = arr[i];
        int j = 0;
        for (j = i - gap; j>=0; j -=gap){
            if(arr[j] > tmp){
                arr[j+gap] = arr[j];
            }else {
                break;
            }
        }
        arr[j+gap] = tmp;
    }
}
