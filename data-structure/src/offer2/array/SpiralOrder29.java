package offer2.array;

import java.util.Arrays;

/**
 * 面试题29-M-顺时针打印矩阵
 *
 * @author Heroin X
 * @date 2020/6/13 18:28
 */
public class SpiralOrder29 {

    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int[] ints = new SpiralOrder29().spiralOrder(matrix);
        System.out.println(Arrays.toString(ints));
    }

    public int[] spiralOrder(int[][] matrix) {

        int left = 0;
        int right = matrix[0].length;
        int top = 0;
        int button = matrix.length;
        int[] res = new int[right*button];
        int j = 0;
        while (true){

            for (int i = left; i < right; i++){
                res[j++] = matrix[top][i];
            }
            top++;
            if (top >= button){
                break;
            }

            for (int i = top; i < button; i++){
                res[j++] = matrix[i][right-1];
            }
            right--;
            if (right <= left){
                break;
            }

            // i >= 0
            for (int i = right-1; i >=left; i--){
                res[j++] = matrix[button-1][i];
            }
            button--;
            if (top >= button){
                break;
            }

            // i >= 0
            for (int i= button-1; i >=top; i--){
                res[j++] = matrix[i][left];
            }
            left++;
            if (right <= left){
                break;
            }

        }

        return res;

    }

}
