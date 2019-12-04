package c6setmap;

/**
 * @author Heroin X
 * @date 2019/10/20 20:42
 */
class X{
    Y b=new Y();
    X(){
        System.out.println("X");
    }
}
class Y{
    Y(){
        System.out.println("y");
    }
}
public class Z extends X{
    Y y=new Y();
    Z(){
        System.out.println("Z");
    }

    public static void main(String[] args) {
        new Z();
    }
}
