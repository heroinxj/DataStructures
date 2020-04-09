package offer.c2p4;

/**
 * 面试题12：矩阵中的路径
 *
 *   链接：https://www.nowcoder.com/questionTerminal/c61c6999eecb4b8f88a98f66b273a3cc
 *     来源：牛客网
 *
 * @author Heroin X
 * @date 2019/12/24 14:39
 */
public class TestPath {
    public static void main(String[] args) {
        String strs = "ABCESFCSADEE";
        char[] matrix = strs.toCharArray();
        int rows = 3;
        int cols = 4;
        String str = "ABF";
        boolean flag = hasPath(matrix, rows, cols, str.toCharArray());
        System.out.println(flag);
    }


    /**
     * 剑指offer中的回溯法：矩阵用一维数组表示
     * @param matrix 字符矩阵
     * @param rows
     * @param cols
     * @param str 路径数组
     * @return
     */
    public static boolean  hasPath(char[] matrix, int rows, int cols, char[] str) {
        // 异常输入
        if (matrix == null || rows <= 0 || cols <= 0 || str == null || str.length == 0)
            return false;
        //visited记录矩阵对应元素是否已经被访问
        boolean[] visited = new boolean[rows * cols];
        //pathLength记录当前判断的元素下标
        int pathLength = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (hasPathCode(matrix, rows, cols, row, col, str, pathLength, visited))
                    return true;
            }
        }
        return false;
    }

    /**
     * 判断指定row,col是否为str[pathLength]，如果是，循环判断下一个元素;否则返回false
     * @param matrix
     * @param rows
     * @param cols
     * @param row 第一个元素rows位置
     * @param col 第一个元素clos位置
     * @param str
     * @param pathLength 当前元素在一维数组中的下标
     * @param visited 是否访问过
     * @return
     */
    private static boolean hasPathCode(char[] matrix, int rows, int cols, int row, int col, char[] str, int pathLength, boolean[] visited) {
        if (pathLength == str.length)
            return true;
        if (row >= 0 && row < rows && col >= 0 && col < cols && matrix[row * cols + col] == str[pathLength] && visited[row * cols + col] == false) {
            visited[row * cols + col] = true;
            pathLength++;
            if (hasPathCode(matrix, rows, cols, row + 1, col, str, pathLength, visited)
                    || hasPathCode(matrix, rows, cols, row - 1, col, str, pathLength, visited)
                    || hasPathCode(matrix, rows, cols, row, col + 1, str, pathLength, visited)
                    || hasPathCode(matrix, rows, cols, row, col - 1, str, pathLength, visited))
                return true;
            // 把不在该路径上的，且设为true的字符重新设为false
            visited[row * cols + col] = false;
        }

        return false;
    }
}



