package day190905;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Heroin X
 * @date 2019/9/5 21:15
 */
public class Demo0905_3 {

    public static void main(String[] args) {
        System.out.println(get());
    }

    static int get( ) {


        String s1="ad1ad111111d";
        String s2="ad";


        String reg="\\ba.*d\\b";
//        boolean matches = s1.matches(reg);


        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(s1);

        int i=0;
        StringBuilder sb=new StringBuilder();
        while (m.find()){
            sb.append(m.group());
            i++;
        }
        System.out.println(sb);
        return i;


    }


}