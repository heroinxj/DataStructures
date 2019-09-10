package c2stackqueues.validParentheses;

import c2stackqueues.stack.ArrayStack;

/**
 * @author Heroin X
 * @date 2019/8/14 9:09
 */
public class SolutionFor20 {
    public static void main(String[] args) {
        String s="()";
        System.out.println(new SolutionFor20().isVaild(s));
        String s2="(][)";
        System.out.println(new SolutionFor20().isVaild(s2));
    }

    /**
     * 要求全部匹配（用全部清空来作为一个指标）
     * @param s
     * @return
     */
    public  boolean isVaild(String s){
        ArrayStack<Character> stack=new ArrayStack<>();
         for (int i=0;i<s.length();i++){
             char c=s.charAt(i);
             if (c=='('||c=='['||c=='{'){
                 stack.push(c);
             }else {
                 if (stack.isEmpty()){
                     return false;
                 }
                 char topChar=stack.peek();
                 if (c==')'&& topChar!='('){
                     return false;
                 }
                 if (c==']'&& topChar!='['){
                     return false;
                 }
                 if (c=='}'&& topChar!='{'){
                     return false;
                 }
                 stack.pop();
             }
         }
         return  stack.isEmpty();
    }

}
