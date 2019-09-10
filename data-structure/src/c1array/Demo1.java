package c1array;

/**
 * 数组基础1
 * @author Heroin X
 * @date 2019/8/12 12:12
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int[] scroes={12,23,33,25};
        int[] scroes2=new int[]{12,34,65};

        //test
        Array2<Integer> array1=new Array2(20);
        for (int i=1;i<=10;i++){
            array1.addLast(i);
        }
        System.out.println(array1);
//
//        array1.add(0,50);
//        System.out.println(array1);
//
//        int i = array1.find(4);
//        System.out.println(i);
//
//        System.out.println(array1.contains(5));
//
//        System.out.println(array1.remove(1));
//        System.out.println(array1);
//
//        array1.removeElement(5);
//        System.out.println(array1);

    }
}
