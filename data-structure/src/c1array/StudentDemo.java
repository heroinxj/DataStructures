package c1array;

/**
 * @author Heroin X
 * @date 2019/8/13 10:08
 */
public class StudentDemo {

    private String name;
    private int score;

    public StudentDemo(){}

    public StudentDemo(String name,int score){
        this.name=name;
        this.score=score;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s, score: %d)",name,score);
    }

    public static void main(String[] args) {
        Array2<StudentDemo> stu=new Array2<>(2);
        stu.addLast(new StudentDemo("小米",15));
        stu.add(1,new StudentDemo("小花",16));
        stu.add(1,new StudentDemo("小老邓",12));
        System.out.println(stu);
    }
}
