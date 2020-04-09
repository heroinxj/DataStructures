package jstudy.basic;

import java.lang.reflect.Method;

/**
 * 反射
 * @author Heroin X
 * @date 2020/4/7 17:18
 */
public class Demo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        // 获取class
        Class<?> demo2 = Class.forName("jstudy.basic.Demo2");

        // 创建实例
        Object o = demo2.newInstance();

        // 获取方法集合
        Method[] me = demo2.getDeclaredMethods();
        for (Method m:me){
            System.out.println(m);
        }
        // 找到某一个方法，但是怎么去使用，这个一个问题？
        Method testForNum = demo2.getDeclaredMethod("testForNum");

    }
}
