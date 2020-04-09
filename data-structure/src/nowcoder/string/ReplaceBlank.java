package nowcoder.string;

/**
 *
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * @author Heroin X
 * @date 2019/12/28 16:10
 */
public class ReplaceBlank {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("We Are Happy");
        String s = new ReplaceBlank().replaceSpace(str);
        System.out.println(s);

    }

    public String replaceSpace(StringBuffer str) {
        int len1 = str.length();
        int len2=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                len2++;
            }
        }

        int length = len1 + len2*2;
        char[] arr = new char[length];
        int j=length-1;

        for (int i=len1-1;i>=0;i--){
            if ((' '==str.charAt(i))){
                arr[j--]='0';
                arr[j--]='2';
                arr[j--]='%';
            }else{
                arr[j]=str.charAt(i);
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }

}
