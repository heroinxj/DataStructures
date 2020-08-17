package day200815;

import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/8/15 20:14
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        if (n > s.length()){
            n = n % s.length();
        }
        String left = s.substring(0, n);
        String right = s.substring(n);
        left = change(left);
        right = change(right);
        String str = left + right;
        str = change(str);
        System.out.println(str);
    }

    public static String change(String str){
        char[] ch = str.toCharArray();
        char temp;
        for (int i = 0; i < ch.length/2; i++){
            temp = ch[i];
            ch[i] = ch[ch.length - i -1];
            ch[ch.length -i - 1] = temp;
        }
        return String.valueOf(ch);
    }
}
