package offer.c2p4;

/**
 *
 * 面试题12：矩阵中的路径
 *
 * @author Heroin X
 * @date 2019/12/26 16:13
 */
public class PathMatrix {

    public static void main(String[] args) {
        //char[] matrix={'a','b','t','g','c','f','c','s','j','d','e','h'};

        char[] matrix={'A','B','C','E','K','F','C','S','A','D','E','E'};
        int rows=3;int cols=4;
        //char[] str={'b','f','c','e'};
        char[] str={'S','E','E'};
//        char[] str={'a','b','f','b'};
        boolean b = hasPath(matrix, rows, cols, str);
        System.out.println(b);
    }


    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str) {



        //标志位，初始化为false
        int[][] flag=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                //循环遍历二维数组，找到起点等于str第一个元素的值，再递归判断四周是否有符合条件的----回溯法
                if(hasPath(matrix,rows,cols,str,i,j,flag,0)){
                    return true;
                }
            }
        }
        return false;

//        //还有特殊情况，第一个字符就找不到的时候 + 第一个字符有两处位置！
//        int[] firstPose = getFirstPose(matrix, str,cols);
//        int i=firstPose[0];int j=firstPose[1];
//        int[][] flag=new int[rows][cols];
//        return hasPath(matrix,rows,cols,str,i,j,flag,0);
    }

    private static boolean hasPath(char[] matrix, int rows, int cols, char[] str, int i, int j,int[][] flag,int index) {

        //二维数组转化为一维数组，特别小心；因为从0开始计的
        int l=cols*i+j;
//        int l=rows*i+j;

        if (i<0 || i>=rows || j<0 || j>=cols || flag[i][j]==1 || matrix[l]!=str[index]){
            return false;
        }

        // 表示全部匹配完成了
        if (index==str.length-1){
            return true;
        }

        // 走完了当前节点，置1
        flag[i][j]=1;

        if (hasPath(matrix,rows,cols,str,i-1,j,flag,index+1)
                || hasPath(matrix,rows,cols,str,i+1,j,flag,index+1)
                || hasPath(matrix,rows,cols,str,i,j-1,flag,index+1)
                || hasPath(matrix,rows,cols,str,i,j+1,flag,index+1)){

            return true;
        }

        // 表示失败了
        flag[i][j]=0;
        return false;
    }

    /**
     * 找到字符串首字符的位置
     * @param matrix
     * @param str
     * @param cols
     * @return
     */
    static int[] getFirstPose(char[] matrix, char[] str,int cols){
        for (int i=0;i<matrix.length;i++){
            if (matrix[i]==str[0]){
                int y = i % cols;
                int x = i/cols;
                return new int[]{x,y};
            }
        }
        return new int[]{-1,-1};
    }
}
