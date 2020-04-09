package offer.c2p3;

/**
 * 面试题4：二维数组中的查找（P44）
 *      从左到右、从上到下 递增排序；给出一个元素，判断是否存在
 *
 * @author Heroin X
 * @date 2019/11/26 10:56
 */
public class TwoDimArrayFind {
    public static void main(String[] args) {
        int[][] arr1=new int[5][5];
        int[][] arr={{1,2,3},{3,4,5},{5,6,7}};
        new TwoDimArrayFind().judge1(arr,6);
        new TwoDimArrayFind().judge3(arr,4);


    }

    /**
     * 1.暴力搜索法
     * @param arr
     * @param element
     */
    public void judge1(int[][] arr,int element){
        int len1 = arr.length;

        for (int i=0;i<len1;i++){
            for (int j=0;j<arr[i].length;j++){
                if (arr[i][j]==element){

                    System.out.println(arr[i][j]);
                }
            }
        }
    }

    /**
     * 2.右上角逼近法，
     *      思路混乱。
     * {{1,2,3},
     *  {3,4,5},
     *  {5,6,7} }
     * @param arr
     * @param element
     */
    public void judge2(int[][] arr,int element){
        int len1 = arr.length;
        int len2=arr[0].length;
        int i1 = arr[0][len2 - 1];
        if (i1>element){
            //第三列都排除了
            int i2=arr[0][len2-2];
            if (i2>element){
            }
        }else {
            //该列有可能，这一行排除
            int j1=arr[1][len2-1];
        }
    }


    /**
     * 3.右上角逼近法——改进后OK
     * {{1,2,3},
     *  {3,4,5},
     *  {5,6,7} }
     * @param arr
     * @param element
     */
    public void judge3(int[][] arr,int element){
        int i=0;
        int j=arr[0].length-1;
        while (i<arr.length||j>=0){
            if (arr[i][j]==element){
                System.out.println(arr[i][j]);
                break;
            }else if (arr[i][j]>element){
                j--;
            }else if (arr[i][j]<element){
                i++;
            }
        }



    }









}
