package offer.c2p3;



/**
 * 面试题5：替换空格
 *      将给定字符串中的空格换成 "%20"
 * @author Heroin X
 * @date 2019/11/27 9:40
 */
public class ReplaceBlank {
    public static void main(String[] args) {
        String str="We are happy";
        new ReplaceBlank().test1(str);
        new ReplaceBlank().test2(str);
        new ReplaceBlank().test3(str);
        new ReplaceBlank().test4(str);
        new ReplaceBlank().test5(str);
    }

    /**
     * 1.直接调用api replace()
     *      不知道里面具体的复杂度是怎么样，面试题不能用；笔试题可以直接使用
     *
     * @param str
     */
    public  void test1(String str){
        String re="%20";
        String replace = str.replace(" ", "%20");
        System.out.println(str);
        System.out.println(replace);
    }

    /**
     * 2.加一个数组，建立一个stringBuilder
     *      增加了空间复杂度
     *
     * @param str1
     */
    public void test2(String str1){
        //增加了一个数组
        String[] split = str1.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<split.length;i++){
            if (i<split.length-1){
                sb=sb.append(split[i]).append("%20");
            }else {
                sb=sb.append(split[i]);
            }
        }
        System.out.println(sb);
    }

    /**
     * 3.指针从后向前移动 的思想
     *      两个数组，
     *             ——有bug...
     *
     * @param str
     */
    public void test3(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                count++;
            }
        }
        char[] oldChar = str.toCharArray();
        int len1 = oldChar.length;
        int len2=len1+count*2;
        char[] newChar=new char[len2];
        //替换字符串
        len1--;
        len2--;
        while (len1>=0&&len2>len1){

            if (oldChar[len1--]==' '){
                newChar[len2--]='0';
                newChar[len2--]='2';
                newChar[len2--]='%';
                len1--;
            }else{
                newChar[len2--]=oldChar[len1--];
            }

        }
        System.out.println("--------test3-----");
        System.out.println(newChar);
    }


    /**
     * 4.从前往后移动，测试OK
     * @param str
     */
    public void test4(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                count++;
            }
        }
        char[] oldChar = str.toCharArray();
        int len1 = oldChar.length;
        int len2=len1+count*2;
        char[] newChar=new char[len2];
        //替换字符串
        int i=0;
        int j=0;
        while (i<len1){

            if (oldChar[i]==' '){
                newChar[j++]='%';
                newChar[j++]='2';
                newChar[j++]='0';
                i++;
            }else{
                newChar[j++]=oldChar[i++];
            }

        }
        System.out.println("--------test4-----");
        System.out.println(newChar);
    }

    /**
     * 测试ok
     * @param str
     */
    public void test5(String str){
        char[] chars = str.toCharArray();
        int len1=chars.length;
        int count=0;

        for (int i=0;i<len1;i++){
            if (chars[i]==' '){
                count++;
            }
        }
        int len2=len1+2*count;
        char[] newChar=new char[len2];

        for (int i=len1-1;i>=0;i--){
            if (chars[i]==' '){
                newChar[--len2]='0';
                newChar[--len2]='2';
                newChar[--len2]='%';
            }else {
                newChar[--len2]=chars[i];
            }
        }

        //不建议使用下面的方式，if括号中的判断条件是一定会执行的，容易造成多次--。

//        for (int i=len1;i>0;){
//            if (chars[--i]==' '){
//                newChar[--len2]='0';
//                newChar[--len2]='2';
//                newChar[--len2]='%';
//            }else {
//                newChar[--len2]=chars[i];
//            }
//        }
        System.out.println("------test5------");
        System.out.println(newChar);
    }



}
