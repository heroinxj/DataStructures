package everyday;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 面试题62 圆圈中最后剩下的数字，约瑟夫环问题
 * @author Heroin X
 * @date 2020/3/30 21:07
 */
public class LastRemain {
    public static void main(String[] args) {
        int i = new LastRemain().lastRemaining(70866, 116922);
        System.out.println(i);
    }

    public int lastRemaining(int n, int m) {
        SimpleDateFormat date = new SimpleDateFormat("yyyy年MM月dd日：HH:mm:ss---SSS(毫秒)");
        String format1= date.format(new Date(System.currentTimeMillis()));
        System.out.println("当前时间："+format1);

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(i, i);
        }
        int len = list.size();
        int p1 = 0;
        int count = 1;
        if(m==1){
            return list.get(len-1);
        }
        while(len > 1){
            count++;
            if(p1 == len-1){
                p1 = 0;
            }else{
                p1++;
            }

            if(count == m){
                list.remove(p1);
                count = 1;
                len --;
            }
            if(p1 >= len){
                p1 = 0;
            }
        }
        String format2= date.format(new Date(System.currentTimeMillis()));
        System.out.println("当前时间："+format2);
        return list.get(0);
    }
}
