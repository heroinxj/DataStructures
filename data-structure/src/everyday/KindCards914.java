package everyday;

/**
 * 分卡牌
 *
 * @author Heroin X
 * @date 2020/3/27 16:05
 */
public class KindCards914 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,1,0,0,0};
        boolean b = new KindCards914().hasGroupsSizeX(arr);
        System.out.println(b);
    }

    public boolean hasGroupsSizeX(int[] deck) {

        int len = deck.length;
        if(len <= 1){
            return false;
        }
        int[] hash = new int[len];
        for(int i = 0; i < len; i++){
            hash[deck[i]]++;
        }

        int j = 0;
        int count = 0;
        for(int i = 0; i < len; i++){
            if(hash[i] != 0){
                if(i!=j){
                    hash[j] = hash[i];
                }
                count++;
                j++;
            }
        }

        //最大公约数
        for(int i = 0; i<j; i++){
            hash[i+1] = getCom(hash[i],hash[i+1]);
            if(hash[i+1] == 1){
                return false;
            }
        }

        return true;
    }

    private int getCom(int a, int b){
        int big = a > b ? a : b;
        int small = a > b ? b : a;

        if(small==0 || big % small == 0){
            return small;
        }
        return getCom(big % small, small);
    }
}
