package sort;

/**
 * @author Heroin X
 * @date 2020/3/21 11:00
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8,9,1,7,2,3,5,4,6,0};
        int[] ints = new MergeSort().mergeSort(arr, 0, arr.length-1);
//        int[] ints = new MergeSort().mergeSort3(arr);
        System.out.println(ints);

    }

    /**
     * 未排除的bug
     *
     * @param arr
     * @param start
     * @param end
     * @return
     */
    public int[] mergeSort(int[] arr, int start, int end){
        if(start < end){
            int mid = (start + end)/2;
            arr = mergeSort(arr, start, mid);
            arr = mergeSort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
        return arr;
    }

    private void merge(int[] arr, int start, int mid, int end) {
        int[] res = new int[mid - start + 1];
        int i = start;
        int j = mid+1;
        int index = 0;

        while (i <= mid
                && j <= end){
            if(arr[i] > arr[j]){
                res[index++] = arr[j++];
            }else{
                res[index++] = arr[i++];
            }
        }

        while (i <= mid){
            res[index++] = arr[i++];
        }

        while (j <= end){
            res[index++] = arr[j++];
        }

        for(int k = 0; k < index; k++){
            arr[start++] = res[k];
        }
    }


    /**
     * 正确的递归写法
     *
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public  int[] mergeSort2(int[] arr, int left, int right) {
        // 如果 left == right，表示数组只有一个元素，则不用递归排序
        if (left < right) {
            // 把大的数组分隔成两个数组
            int mid = (left + right) / 2;
            // 对左半部分进行排序
            arr = mergeSort2(arr, left, mid);
            // 对右半部分进行排序
            arr = mergeSort2(arr, mid + 1, right);
            //进行合并
            merge2(arr, left, mid, right);
        }
        return arr;
    }

    // 合并函数，把两个有序的数组合并起来
    // arr[left..mif]表示一个数组，arr[mid+1 .. right]表示一个数组
    private void merge2(int[] arr, int left, int mid, int right) {
        //先用一个临时数组把他们合并汇总起来
        int[] a = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                a[k++] = arr[i++];
            } else {
                a[k++] = arr[j++];
            }
        }
        while(i <= mid) a[k++] = arr[i++];
        while(j <= right) a[k++] = arr[j++];
        // 把临时数组复制到原数组
        for (i = 0; i < k; i++) {
            arr[left++] = a[i];
        }
    }

    /**
     * 非递归写法
     *
     * @param arr
     * @return
     */
    public int[] mergeSort3(int[] arr) {
        int n = arr.length;
        // 子数组的大小分别为1，2，4，8...
        // 刚开始合并的数组大小是1，接着是2，接着4....
        for (int i = 1; i < n; i += i) {
            //进行数组进行划分
            int left = 0;
            int mid = left + i - 1;
            int right = mid + i;
            //进行合并，对数组大小为 i 的数组进行两两合并
            while (right < n) {
                // 合并函数和递归式的合并函数一样
                merge2(arr, left, mid, right);
                left = right + 1;
                mid = left + i - 1;
                right = mid + i;
            }
            // 还有一些被遗漏的数组没合并，千万别忘了
            // 因为不可能每个字数组的大小都刚好为 i
            if (left < n && mid < n) {
                merge2(arr, left, mid, n - 1);
            }
        }
        return arr;
    }
}
