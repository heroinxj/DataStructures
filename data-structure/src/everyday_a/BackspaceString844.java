package everyday_a;

import java.util.Stack;

/**
 * @author Heroin X
 * @date 2020/4/10 14:39
 */
public class BackspaceString844 {

    public static void main(String[] args) {
        boolean b = new BackspaceString844().backspaceCompare3("bxj##we" , "bxj###we");
        System.out.println(b);
    }

    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
            while (i >= 0) { // Find position of next possible char in build(S)
                if (S.charAt(i) == '#') {skipS++; i--;}
                else if (skipS > 0) {skipS--; i--;}
                else break;
            }
            while (j >= 0) { // Find position of next possible char in build(T)
                if (T.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }
            // If two actual characters are different
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            // If expecting to compare char vs nothing
            if ((i >= 0) != (j >= 0))
                return false;
            i--; j--;
        }
        return true;
    }

    public boolean backspaceCompare2(String S, String T) {
        int i = S.length()-1;
        int j = T.length()-1;
        int s = 0;
        int t = 0;

        while( i >= 0 || j >= 0){

            while(i >= 0){
                if(S.charAt(i) == '#'){
                    i--;
                    s++;
                }else if(s > 0){
                    i--;
                    s--;
                }else{
                    break;
                }
            }

            while(j >= 0){
                if(T.charAt(j) == '#'){
                    j--;
                    t++;
                }else if(t > 0){
                    j--;
                    t--;
                }else{
                    break;
                }
            }

            if(i>=0 && j>=0 && S.charAt(i) != T.charAt(j)){
                return false;
            }

            if((i>=0) != (j>=0)){
                return false;
            }
            i--;
            j--;
        }

        return true;
    }


    public boolean backspaceCompare3(String S, String T) {
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for(Character s1:s){
            if( s1=='#'){
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }else{
                stack1.push(s1);
            }
        }

        for(Character t1:t){
            if(t1=='#'){
                if(!stack2.isEmpty()){
                    stack2.pop();
                }
            }else{
                stack2.push(t1);
            }
        }

        while(!stack1.isEmpty() && !stack2.isEmpty() ){
            if(stack1.peek() != stack2.peek()){
                return false;
            }else{
                stack1.pop();
                stack2.pop();
            }
        }

        if(!stack1.isEmpty() || !stack2.isEmpty()){
            return false;
        }

        return true;
    }




}
