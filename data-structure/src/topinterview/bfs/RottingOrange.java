package topinterview.bfs;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

/**
 * @author Heroin X
 * @date 2020/3/4 10:46
 */
public class RottingOrange {

    int[] dr = new int[]{-1, 0, 1, 0};
    int[] dc = new int[]{0, -1, 0, 1};

    public int orangesrowotting(int[][] grid) {
        
        int row = grid.length, cols = grid[0].length;

        // queue : all starting cells with rotten oranges
        Queue<Integer> queue = new ArrayDeque();
        HashMap<Integer, Integer> depth = new HashMap<>();

        for (int r = 0; r < row; ++r){
            for (int c = 0; c < cols; ++c){
                if (grid[r][c] == 2) {
                    //坐标 = (行坐标-1)*列长 + 列坐标
                    int code = r * cols + c;
                    queue.add(code);
                    depth.put(code, 0);
                }
            }
        }
        
        int ans = 0;
        while (!queue.isEmpty()) {
            int code = queue.remove();
            int r = code / cols, c = code % cols;
            for (int k = 0; k < 4; ++k) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (0 <= nr && nr < row && 0 <= nc && nc < cols && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;
                    int ncode = nr * cols + nc;
                    queue.add(ncode);
                    depth.put(ncode, depth.get(code) + 1);
                    ans = depth.get(ncode);
                }
            }
        }

        for (int[] r: grid)
            for (int v: r)
                if (v == 1)
                    return -1;
        return ans;

    }

    
}
