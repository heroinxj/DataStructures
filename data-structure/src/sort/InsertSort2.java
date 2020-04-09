package sort;

/**
 * @author Heroin X
 * @date 2020/3/28 21:51
 */
public class InsertSort2 {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,5,7,3,1,8};
        new InsertSort2().insert(arr);
        System.out.println(arr.toString());


    }

    public void insert(int[] arr){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            //arr[i]是新加入的元素，需要将其和左侧所有的元素比较
            int tmp = arr[i];
            int j = 0;
            // 比较左侧的所有元素
            for(j = i - 1; j >=0; j--){
                if(arr[j] > tmp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
}
