package everyday;

/**
 * 695- 岛屿的最大面积
 * 给定一个包含了一些 0 和 1的非空二维数组 grid , 一个 岛屿 是由四个方向 (水平或垂直) 的 1 (代表土地) 构成的组合。
 * 你可以假设二维矩阵的四个边缘都被水包围着。
 * 找到给定的二维数组中最大的岛屿面积。(如果没有岛屿，则返回面积为0。)
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/max-area-of-island
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * @author Heroin X
 * @date 2020/3/15 9:52
 */
public class MaxAreaOfIsland695 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        System.out.println(new MaxAreaOfIsland695().maxAreaOfIsland(arr));
    }

    int row = 0, col = 0, area = 0;

    public int maxAreaOfIsland(int[][] grid) {

        row = grid.length;
        col = grid[0].length;
        for(int i = 0; i < row; i++){
            for(int j =  0; j < col; j++){
                if(grid[i][j] == 1){
                    //int count = 0;
                    int s = dfs(grid, i, j);
                    if(s > area){
                        area = s;
                    }
                }
            }
        }
        return area;

    }

    private int dfs(int[][] grid, int i, int j){
        if(i < 0 || i >= row || j < 0 || j >=col || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;
//        count++;
//        dfs(grid, i+1, j, count);
//        dfs(grid, i-1, j ,count);
//        dfs(grid, i, j+1, count);
//        dfs(grid, i, j-1, count);

        return dfs(grid, i+1, j)+
        dfs(grid, i-1, j )+
        dfs(grid, i, j+1)+
        dfs(grid, i, j-1)+1;

    }

    private int dfs2(int[][] grid, int i, int j, int count){
        if(i < 0 || i >= row || j < 0 || j >=col || grid[i][j] == 0){
            return 0;
        }
        int c = count;
        grid[i][j] = 0;
        count++;
        dfs2(grid, i+1, j, c);
        dfs2(grid, i-1, j ,c);
        dfs2(grid, i, j+1, c);
        dfs2(grid, i, j-1, c);
        return c;
    }
}
