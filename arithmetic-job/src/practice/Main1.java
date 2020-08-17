package practice;

import java.util.*;

/**
 * 京东17秋招-集合
 *
 * 输入：
 * 多组（不超过 5 组）数据。
 * 每组输入数据分为三行，第一行有两个数字 n,m($0＜n,m\leq10000$)，分别表示集合 A 和集合 B 的元素个数。
 * 后两行分别表示集合 A 和集合 B。每个元素为不超出 int 范围的整数，每个元素之间有一个空格隔开。
 *
 * 输出
 * 针对每组数据输出一行数据，表示合并后的集合，要求从小到大输出，每个元素之间有一个空格隔开。
 *
 * @author Heroin X
 * @date 2020/4/16 22:30
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            String a = in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();

            String[] split1 = b.split(" ");
            String[] split2 = c.split(" ");
            HashSet<Integer> set = new HashSet<>();
            for (String s1:split1){
                set.add(Integer.parseInt(s1));
            }

            for (String s2:split2){
                int tmp = Integer.parseInt(s2);
                if (!set.contains(tmp)){
                    set.add(tmp);
                }
            }

            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(set);
            list.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1-o2;
                }
            });

            int size = list.size();
            for (int i = 0; i < size-1;i++){
                System.out.print(list.get(i)+" ");
            }
            System.out.println(list.get(size-1));

        }
    }
}
