package nowcoder.array;

/**
 *
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author Heroin X
 * @date 2019/12/27 14:25
 */
public class TwoDimArrayFind {
    public static void main(String[] args) {

    }

    /**
     * 解法1，递归。AC
     *
     * @param target
     * @param array
     * @return
     */
    public  boolean find(int target, int [][] array) {
        int rows=array.length;
        int cols=array[0].length;
        return find(target,array,rows,cols,0,cols-1);
    }

    public  boolean find(int target,int[][] array,int rows,int cols,int i,int j){

        //递归终止
        if(i<0 || i>=rows || j <0 || j>=cols){
            return false;
        }

        if(array[i][j]==target){
            return true;
        }

        if(array[i][j]>target){
            return find(target,array,rows,cols,i,j-1);
        }

        if(array[i][j]<target){
            return find(target,array,rows,cols,i+1,j);
        }

        return false;
    }

    /**
     * 解法2。AC
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int [][] array) {
        int i = 0;
        int j = array[0].length - 1;
        while (i >= 0 && i < array.length && j >= 0 && j < array[0].length) {
            if (array[i][j] == target) {
                return true;
            } else if (array[i][j] > target) {
                j--;
            } else if (array[i][j] < target) {
                i++;
            }
        }
        return false;
    }


}
