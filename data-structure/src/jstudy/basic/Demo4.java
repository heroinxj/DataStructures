package jstudy.basic;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 容器的学习
 *
 * @author Heroin X
 * @date 2020/4/8 8:27
 */
public class Demo4 {
    public static void main(String[] args) {
        Demo4 demo4 = new Demo4();
        demo4.testForArrayList();
        demo4.testForHashMap();

    }

    private void testForArrayList(){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);
        list1.add(10);
        list1.add(11);
        list1.add(12);
        list1.add(13);
    }

    private void testForHashMap(){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
    }
}
