package offer.c2p4;

import java.util.ArrayList;

/**
 *
 * 面试题13：机器人的运动范围
 *
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 *
 * @author Heroin X
 * @date 2019/12/24 16:05
 */
public class RobotMoveRange {

    public static void main(String[] args) {
        int i = new RobotMoveRange().movingCount(3, 12, 12);
        System.out.println(i);
    }


    public int movingCount(int threshold, int rows, int cols) {
        // 需要记录当前点的坐标
        int i=0;int j=0;
        int[][] arr = new int[rows][cols];
        return moving(threshold,rows,cols,i,j,0,arr);
    }

    int moving(int threshold, int rows, int cols, int i, int j,int count,int[][] arr) {

        //递归终止条件
        if (sum2(i,j)>threshold || i>=rows || j>=cols || i<0 || j<0 || arr[i][j]==1){
            return 0;
        }

        arr[i][j]=1;

        return moving(threshold,rows,cols,i-1,j,count,arr)+moving(threshold,rows,cols,i+1,j,count,arr)
                + moving(threshold,rows,cols,i,j+1,count,arr)+moving(threshold,rows,cols,i,j-1,count,arr)+1;

//        if (符合要求？ 有没有走过？)
//        count=1;
//        else return 0；
//
//        if (i>0 && countTotal(i,j)<threshold && arr[i][j]==0){
//            arr[i][j]=1;
//            i++;
//            count += moving(threshold,rows,cols,i,j,count++,arr);
//        }
//
//        if (i<rows && countTotal(i,j)<threshold && arr[i][j]==0){
//            arr[i][j]=1;
//            i--;
//            return moving(threshold,rows,cols,i,j,count++,arr);
//        }
//
//        if (j>0 && countTotal(i,j)<threshold && arr[i][j]==0){
//            arr[i][j]=1;
//            j++;
//            return moving(threshold,rows,cols,i,j,count++,arr);
//        }
//
//        if (j<cols && countTotal(i,j)<threshold && arr[i][j]==0){
//            arr[i][j]=1;
//            j--;
//            return moving(threshold,rows,cols,i,j,count++,arr);
//        }
//
//
//        return count;


    }


    static int sum(int rows, int cols){
        int i=0;int j=0;
        ArrayList<Integer> arr1 = new ArrayList<>();
        do {
            i=rows%10;
            arr1.add(i);
            rows=rows/10;
        }while (rows>0);

        do {
            j=cols%10;
            arr1.add(j);
            cols=cols/10;
        }while (cols>0);

        int count =0;
        for (int k=0;k<arr1.size();k++){
            count=count+arr1.get(k);
        }

        return count;
    }

    static int sum2(int rows, int cols){

        int sum=0;
        do {
            sum=sum+ rows % 10;
            rows=rows/10;
//        }while (rows/10>0);
        }while (rows>0);

        do {
            sum=sum+ cols % 10;
            cols=cols/10;
//        }while (cols/10>0);
        }while (cols>0);

        return sum;
    }
}
