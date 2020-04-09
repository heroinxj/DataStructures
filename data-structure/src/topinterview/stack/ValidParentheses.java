package topinterview.stack;

/**
 * @author Heroin X
 * @date 2020/1/22 16:52
 */
public class ValidParentheses {

    public static void main(String[] args) {
        String s ="()[]{}";
        String s2 ="abcd";
        String ab = s2.replace("ab", "12d");
        boolean valid = new ValidParentheses().isValid(s);
        System.out.println(valid);
    }

    public boolean isValid(String s) {

        while (s.contains("()") || s.contains("[]") || s.contains("{}")){

            s = s.replace("()", "");
            s = s.replace("[]","");
            s = s.replace("{}","");
        }
        return s.equals("");

    }

    boolean judge(char a, char b){
        return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
    }
}
