package everyday;

/**
 * 翻转字符串里面的单词
 *
 * @author Heroin X
 * @date 2020/4/10 16:36
 */
public class ReverseWords151 {
    public static void main(String[] args) {
        ReverseWords151 rev = new ReverseWords151();
        String s = "   hello   world!   ";
        String s1 = rev.reverseWords(s);
        System.out.println(s1);
    }

    public String reverseWords(String s) {

        String[] split = s.split(" ");
        int len = split.length;
        StringBuilder sb = new StringBuilder();
        if (!"".equals(split[len-1])){
            sb.append(split[len-1]);
        }

        for (int i = len -2; i >= 0; i--){
            if (!"".equals(split[i])){
                sb.append(" ").append(split[i]);
            }
        }

        return sb.toString();

    }
}
