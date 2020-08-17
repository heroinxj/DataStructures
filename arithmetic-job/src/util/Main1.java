package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Heroin X
 * @date 2020/4/16 22:02
 */

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String sa = bf.readLine();

        // 转化包装类
        int n = Integer.valueOf(sa);
        String line = bf.readLine();
        line= line.trim();
        String[] s = line.split(" ");
        // 创建一个int型的数组用来储存第二行的个数字
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = Integer.parseInt(s[i]);

    }

}