package paper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Heroin X
 * @date 2020/5/15 9:05
 */
public class LCSDemo1 {
    public static void main(String[] args) throws IOException {

        // 预处理
        String path1 = "D:\\lib\\IDEA_space\\mygithub-repository\\data-structures\\antlr-demo1\\src\\main\\resources\\demo1.txt";
        String path2 = "D:\\lib\\IDEA_space\\mygithub-repository\\data-structures\\antlr-demo1\\src\\main\\resources\\demo2.txt";

        LCSDemo1 lcsDemo = new LCSDemo1();
        // 读取文本
        File file1name = new File(path1);
        File file2name = new File(path2);
        String s1 = ReadTxt.txt2String(file1name);
        String s2 = ReadTxt.txt2String(file2name);
        // 用两个数组封装
        List<String> list1 = lcsDemo.stringToList(s1);
        List<String> list2 = lcsDemo.stringToList(s2);

        // 一、使用属性计数法度，使用种别码
        //1.1 大小
        int a1 = s1.length();
        a1 /= 10;
        int b1 = s2.length();
        b1 /=10;
        //1.2 行数
        int a2 = list1.size();
        int b2 = list2.size();
        //1.3 关键字数量
        String regex1 = "<\\d{1,3}";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher1  = pattern.matcher(s1);
        int a3=0;
        int b3=0;

        //1.4 标志符数量
        int a4=0;
        int b4=0;

        //1.5 运算符数量
        int a5=0;
        int b5=0;

        //1.6 常数数量
        int a6=0;
        int b6=0;


        while (matcher1.find()) {
            String group = matcher1.group();
            group = group.replace("<", "");
            int tmp = Integer.parseInt(group);
            if ((tmp>=1 && tmp <=52)||tmp>=100){
                a3++;
            }

            if (tmp == 90){
                a4++;
            }

            if (tmp>=60 && tmp <=84){
                a5++;
            }

            if (tmp>=91 && tmp <=93){
                a6++;
            }
        }

        Matcher matcher2  = pattern.matcher(s1);
        while (matcher2.find()) {
            String group = matcher2.group();
            group = group.replace("<", "");
            int tmp = Integer.parseInt(group);
            if ((tmp>=1 && tmp <=52)||tmp>=100){
                b3++;
            }

            if (tmp == 90){
                b4++;
            }

            if (tmp>=60 && tmp <=84){
                b5++;
            }

            if (tmp>=91 && tmp <=93){
                b6++;
            }
        }

        int pq = a1*b1+a2*b2+a3*b3+a4*b4+a5*b5+a6*b6;
        double pq2 = Math.sqrt((a1*a1+a2*a2+a3*a3+a4*a4+a5*a5+a6*a6)*(b1*b1+b2*b2+b3*b3+b4*b4+b5*b5+b6*b6));
        float sim1 = (float) (pq/pq2);
        System.out.println("1 程序代码属性相似度："+sim1);

        // 二、使用结构相似度 LCS
        List<Float> res = new ArrayList<>();
        //1.使用LCS算法,list1为标准模板
        int size1 = list1.size();
        int size2 = list2.size();

        int diff = Math.abs(size1-size2);
        for (int k=0; k<diff;k++){
            res.add(0f);
        }

        for (int i = 0; i < list1.size(); i++){
            String str1 = list1.get(i);
            float lcsLen = 0;
            int index=0;

            if(list2.size()==0){
                break;
            }

            for (int j = 0; j < list2.size(); j++){
                String str2 = list2.get(j);
                int len = lcsDemo.lcs(str1, str2);
                if (len > lcsLen){
                    lcsLen = len;
                    index = j;
                }
            }

            int maxLong = Math.max(list1.get(i).length(),list2.get(index).length());
            float tmp = lcsLen/maxLong;
            res.add(tmp);
            list2.remove(index);
        }

        //2.计算结构相似度
        float sum = 0;
        for (float tmp : res){
            sum += tmp;
        }
        float sim2 = sum/res.size();
        System.out.println("2 程序代码结构相似度："+sim2);

        //三、计算编辑距离的整体相似度 LD
        s1=s1.replace("<","");
        s1=s1.replace(">","");
        s2=s2.replace("<","");
        s2=s2.replace(">","");
        float ed = new EditDistance().minDistance(s1, s2);
        float sim3 = 1-ed/(Math.max(s1.length(),s2.length()));
        System.out.println("3 程序代码整体相似度："+sim3);

        float sim = (float) (sim1*0.3+sim2*0.6+sim3*0.1);
        System.out.println("静态评分为 "+sim*100);
    }

    /**
     * LCS算法
     * @param text1
     * @param text2
     * @return
     */
    public int lcs(String text1, String text2) {
        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int length1 = t1.length;
        int length2 = t2.length;
        int[][] dp = new int[length1+1][length2+1];
        for (int i = 1; i < length1 +1; i++) {
            for (int j = 1; j < length2 +1; j++) {
                if (t1[i-1] == t2[j-1]){
                    // 这边找到一个 lcs 的元素，继续往前找
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else {
                    //谁能让 lcs 最长，就听谁的
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[length1][length2];
    }


    /**
     *  List包装
     * @param str
     * @return
     */
    public List<String> stringToList(String str){
        String[] split = str.trim().split("\\r\n");
        List<String> list = new ArrayList<>();
        for (String s:split){
            list.add(s);
        }
        return list;

    }
}
