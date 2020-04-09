package sort;

/**
 * @author Heroin X
 * @date 2020/3/21 9:36
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8,9,1,7,2,3,5,4,6,0};
        int[] shell = new ShellSort().shell(arr);
        System.out.println(shell);
    }

    public int[] shell(int[] arr){
        int len = arr.length;

        for(int gap = len/2; gap > 0; gap /= 2){
            for (int i = gap; i < len; i++){
                insert(arr, gap, i);
            }
        }
        return arr;
    }

    private void insert(int[] arr, int gap, int i) {

        int tmp = arr[i];
        int j = 0;
        for(j = i - gap; j >= 0; j -= gap){
            if(arr[j] > tmp){
                arr[j+gap] = arr[j];
            }else{
                break;
            }
        }
        arr[j+gap] = tmp;
    }
}
