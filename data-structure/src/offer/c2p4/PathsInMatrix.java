package offer.c2p4;

/**
 * 2.4.3 回溯法
 *
 * 面试题12：矩阵中的路径
 *      判断一个矩阵中是否存在着一条包含某个给定字符串的路径，
 *
 * 1.带标签的 break label;
 *
 * @author Heroin X
 * @date 2019/12/24 9:22
 */
public class PathsInMatrix {
    public static void main(String[] args) {
        int[][] matrix={{'a','b','t','g'},{'c','f','c','s'},{'j','d','e','h'}};
        new PathsInMatrix().findPaths(matrix,"bfce");

    }

    public void findPaths(int[][] matrix,String str){
        int row=matrix.length;
        int col=matrix[0].length;
        int i=0;int j=0;int index=0;
        label:
        for (;i<row;i++){
            for (;j<col;j++){
                if (str.charAt(index)==matrix[i][j]){
                    System.out.println(i+"---111---"+j);
                    break label;
                }
            }
        }
        System.out.println(i+"---222---"+j);
        getPath(matrix,str,i,j,row,col,index);
    }

    static int[][] getPath(int[][] matrix, String str, int i, int j, int row, int col, int index){

        //终止条件？


        index++;
        char nextStr= str.charAt(index);


        if(i==0 && j>0 && j<col-1){
            if (nextStr==matrix[i][j--]){
                return getPath(matrix,str,i,j,row,col,index);
            }

            else if (nextStr==matrix[i][j++]){
                return getPath(matrix,str,i,j,row,col,index);
            }

            else if (nextStr==matrix[i++][j]){
                return getPath(matrix,str,i,j,row,col,index);
            }

            else {
                return null;
            }
        }

        if(i>0 && i<row-1 && j>0 && j<col-1){
            if (nextStr==matrix[i][j--]){
                return getPath(matrix,str,i,j,row,col,index);
            }

            else if (nextStr==matrix[i][j++]){
                return getPath(matrix,str,i,j,row,col,index);
            }

            else if (nextStr==matrix[i++][j]){
                return getPath(matrix,str,i,j,row,col,index);
            }

            else {
                index--;
                labelA:
                for (;i>=0;i--){
                    for (;j>=0;j--){
                        if (str.charAt(index)==matrix[i][j]){
                            System.out.println(i+"---333---"+j);
                            break labelA;
                        }
                    }
                }
                return getPath(matrix,str,i,j,row,col,index);

            }
        }



        return null;
    }
}
