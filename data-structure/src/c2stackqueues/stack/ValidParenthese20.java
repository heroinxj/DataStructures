package c2stackqueues.stack;

import java.util.Stack;

/**
 * @author Heroin X
 * @date 2020/4/1 10:43
 */
public class ValidParenthese20 {
    public static void main(String[] args) {
        new ValidParenthese20().isValid("([])");
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

}
