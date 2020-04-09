package jstudy.basic;


import java.util.HashSet;

/**
 * 1-1-1 Java基础
 *
 * @author Heroin X
 * @date 2020/4/2 10:23
 */
public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo = new Demo1();
        demo.test1();
    }

    private void test1(){

        int[] arr = new int[]{1,4,2,6};
        Integer[] arr2 = new Integer[]{1,4,2,6};

//        Arrays.sort(arr, Collections.reverseOrder());

//        Arrays.sort(arr, new Comparable<int[]>() {
//            @Override
//            public int compareTo(Integer o) {
//                return 0;
//            }
//        });

        People people1 = new People("e",10);
        People people2 = new People("e",10);
        System.out.println(people1.equals(people2));
        System.out.println(people1==people2);

        HashSet<Object> set = new HashSet<>();
        set.add(people1);
        set.add(people2);
        System.out.println(people1.hashCode());
        System.out.println(people2.hashCode());
        System.out.println("s:"+set);
        int a =10;
        int b = 9;
        int b1 = 10;
        int b2 = 0;
        int i = a^b;
        int i1 = a^b1;
        int i2 = a^b2;
        System.out.println(i+"--"+i1+"--"+i2);
        Integer a1 = 10;
        Integer c1 =8;
//        String a2 = "aa";
//        String c2 = "aa";
        String c3 = new String("aa");
        String c4 = "aa";
        int i3 = c3.hashCode();
        int i4 = c4.hashCode();
        boolean f8 = c3 == c4;
        boolean f9 = c3.equals(c4);

        boolean f1 = a==b1;
        boolean f2 = a1==c1;
//        boolean f3 = a2 == c2;
//        boolean f4 = a2.equals(c2);
//        boolean f6 = a2==c3;
//        boolean f7 = a2.equals(c3);

        boolean f5 = people1==people2;

        int x = 1;
        editNum(x);
        System.out.println(x);
        editName(people1);
        System.out.println(people1);

    }

    public void editName(People p){
        p.setName("n");
    }

    public void editNum(int a){
        a = 0;
    }


}

class People{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (o == null || this.getClass()!=o.getClass()){
            return false;
        }

        if (this == o){
            return true;
        }

        People p = (People) o;
        return name == p.name && age == p.age;
    }

    @Override
    public int hashCode(){
        int nameHash = name.hashCode();
        int i = nameHash ^ age;
        return i;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        People people = (People) o;
//        return Objects.equals(name, people.name) &&
//                Objects.equals(age, people.age);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}
