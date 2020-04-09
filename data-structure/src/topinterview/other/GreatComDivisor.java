package topinterview.other;

/**
 * @author Heroin X
 * @date 2020/3/25 16:58
 */
public class GreatComDivisor {
    public static void main(String[] args) {
        int greatCommonDiv = new GreatComDivisor().getGreatCommonDiv(10, 5);
        System.out.println(greatCommonDiv);

    }

    public int getGreatCommonDiv(int a, int b){
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        if(big % small == 0){
            return small;
        }

        return getGreatCommonDiv(big % small, small);
    }
}
