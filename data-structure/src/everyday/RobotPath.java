package everyday;

/**
 * 机器人运动路径
 * @author Heroin X
 * @date 2020/4/8 21:17
 */
public class RobotPath {

    public static void main(String[] args) {
        int i = new RobotPath().movingCount(11, 8, 16);
        System.out.println(i);
    }



    int row = 0;
    int col = 0;
    public int movingCount(int m, int n, int k) {
        row = m;
        col = n;
        int[][] flag = new int[m][n];
        int i = 0;
        int j = 0;
        return dfs(i, j, flag, k);
    }

    private int dfs(int i, int j,int[][] flag, int k){
        if(i < 0 || i >= row || j < 0 || j >= col || sum(i, j) > k || flag[i][j] == 1 ){
            return 0;
        }

        flag[i][j] = 1;
        return dfs(i+1, j, flag, k) + dfs(i-1, j, flag, k) + dfs(i, j+1, flag, k) + dfs(i, j-1, flag, k) + 1;
    }

    private int sum(int a, int b){
        int res = 0;
        while(a > 0){
            res += a % 10;
            a /= 10;
        }

        while(b > 0){
            res += b % 10;
            b /= 10;
        }
        return res;
    }
}
