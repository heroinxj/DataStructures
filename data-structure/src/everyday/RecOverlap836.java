package everyday;

/**
 * @author Heroin X
 * @date 2020/3/18 9:32
 */
public class RecOverlap836 {
    public static void main(String[] args) {
        int[] rec1 = new int[]{0,0,2,2};
        int[] rec2 = new int[]{1,1,3,3};
        boolean rectangleOverlap = new RecOverlap836().isRectangleOverlap(rec1, rec2);
    }

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean x = (rec1[2] < rec2[0] || rec2[2] < rec1[0]);
        boolean y = (rec1[3] < rec2[1] || rec2[3] < rec1[1]);
        return (x && y);
    }
}
