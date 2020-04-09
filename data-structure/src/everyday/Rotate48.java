package everyday;

/**
 * 旋转图像，数组
 *
 * @author Heroin X
 * @date 2020/4/7 22:14
 */
public class Rotate48 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        new Rotate48().rotate(arr);
    }

    public void rotate(int[][] matrix) {
        int n = matrix.length - 1;

        // 整体做对角线交换
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }

        // 每行元素对称交换
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = tmp;
            }
        }

    }
}
