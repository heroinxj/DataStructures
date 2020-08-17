package jstudy.collect;

import java.util.HashMap;

/**
 * @author Heroin X
 * @date 2020/4/2 10:23
 */
public class Demo {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1,"Lisa");
        hash.put(2,"Lua");
        hash.put(3,"Jee");

        String s = new String("aa");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer sb = new StringBuffer();

        Integer integer = Integer.valueOf(s);
        int i = Integer.parseInt(s);

        ThreadLocal<Object> objectThreadLocal = new ThreadLocal<>();


    }



    ThreadLocal<String> realName = new ThreadLocal<>();
    ThreadLocal<Double> totalScore = new ThreadLocal<>();

    String determineDegree() {
        double score = totalScore.get();
        if (score >= 90) {
            return "A";
        }
        if (score >= 80) {
            return "B";
        }
        if (score >= 70) {
            return "C";
        }
        if (score >= 60) {
            return "D";
        }
        return "E";
    }

    double determineOptionalcourseScore() {
        double score = totalScore.get();
        if (score >= 90) {
            return 10;
        }
        if (score >= 80) {
            return 20;
        }
        if (score >= 70) {
            return 30;
        }
        if (score >= 60) {
            return 40;
        }
        return 60;
    }

}
