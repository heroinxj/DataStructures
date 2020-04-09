package everyday;

/**
 * @author Heroin X
 * @date 2020/3/26 8:03
 */
public class RookCapture999 {

    public static void main(String[] args) {
        char[][] board = new char[][]{{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},{'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        new RookCapture999().numRookCaptures(board);
    }

    public int numRookCaptures(char[][] board) {
        int len = board.length;
        boolean flag = false;
        int i = 0, j = 0;
        A:
        // 1. find the white Rook
        for(i = 0; i < len && !flag; i++){
            for( j = 0; j < len && !flag; j++){
                if(board[i][j] == 'R'){
                    flag = true;
//                    break A;
                }
            }
        }
        int count = 0;
        //2. find 4 directions
        for(int r1 = 0; r1 < i; r1++ ){
            if(board[r1][j] =='B'){
                break;
            }
            if(board[r1][j] == 'p'){
                count++;
                break;
            }
        }

        for( int r2 = i; r2 < len; r2++){
            if(board[r2][j] =='B'){
                break;
            }
            if(board[r2][j] == 'p'){
                count++;
                break;
            }
        }

        for(int c1 = 0; c1 < j; c1++){
            if(board[i][c1] =='B'){
                break;
            }
            if(board[i][c1] == 'p'){
                count++;
                break;
            }
        }

        for(int c2 = j; c2 < len; c2++){
            if(board[i][c2] =='B'){
                break;
            }
            if(board[i][c2] == 'p'){
                count++;
                break;
            }
        }
        System.out.println(count);
        return count;

    }


}
