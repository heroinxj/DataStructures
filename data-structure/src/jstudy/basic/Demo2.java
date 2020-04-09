package jstudy.basic;

import java.math.BigDecimal;
import java.util.*;

/**
 * 1-1-2 Java知识疑难点
 *
 * @author Heroin X
 * @date 2020/4/7 8:44
 */
public class Demo2 {
    public static void main(String[] args) {
        Demo2 demo2 = new Demo2();
//        demo2.testForNum();
//        demo2.testForArrays();
        demo2.testForEnum();

    }

    private void testForNum(){
        Integer a1 = 3;
        Integer b1 = 3;
        System.out.println(a1 == b1);
        System.out.println(a1.equals(b1));

        Integer a2 = new Integer(3);
        Integer b2 = new Integer(3);
        System.out.println(a2 == b2);
        System.out.println(a2.equals(b2));

        int a =3;
        int b =3;
        System.out.println(a == b);

        int a3 = new Integer(3);
        int b3 = new Integer(3);
        System.out.println(a3==b3);

        // 错误参数使用
        BigDecimal c1 = new BigDecimal(1.2);
        BigDecimal c2 = new BigDecimal(1.3);
        BigDecimal c3 = new BigDecimal(1.4);
        BigDecimal s1 = c3.subtract(c2);
        BigDecimal s2 = c2.subtract(c1);
        System.out.println(s1.equals(s2));

        // 应该使用string 参数
        BigDecimal a4 = new BigDecimal("1.0");
        BigDecimal b4 = new BigDecimal("0.9");
        BigDecimal c4 = new BigDecimal("0.8");
        BigDecimal x = a4.subtract(b4);
        BigDecimal y = b4.subtract(c4);
        System.out.println(x.equals(y));
    }

    private void testForArrays(){
        int[] arr1 = {3,5,1,7};
        List<int[]> ints = Arrays.asList(arr1);

        Integer[] arr3 = {4,2,6,9};
        List<Integer> integers = Arrays.asList(arr3);

        String[] arr2 = new String[]{"apple","peach","banar"};
        List<String> strings = Arrays.asList(arr2);

        Collections.reverse(strings);
        arr2 = strings.toArray(new String[0]);

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            while ("apple".equals(next)){
                iterator.remove();
            }
        }

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("peach");
        list.add("pear");
        list.add("banana");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            if (next.equals("apple")){
                it.remove();
            }
        }

        for (String li:list){
            if ("peach".equals(li)){
                list.remove(li);
            }
        }



    }

    private void testForEnum(){
        System.out.println(AppleStatus.READY.name());
        System.out.println(AppleStatus.READY.name().getClass());
        System.out.println(AppleStatus.READY);
        System.out.println(AppleStatus.READY.getClass());
    }

    public enum AppleStatus{
        ORDERED,
        READY,
        DELIVERED;
    }
}

class Pizza{
//    private PizzaStatus status;
    public enum PizzaStatus{
        ORDERED,
        READY,
        DELIVERED;
    }
}
