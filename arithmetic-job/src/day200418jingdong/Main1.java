package day200418jingdong;

import java.util.HashMap;
        import java.util.Iterator;
        import java.util.Scanner;
        import java.util.Set;

/**
 * 京东第一题-长方体
 *
 * @author Heroin X
 * @date 2020/4/18 14:14
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        while(in.hasNext()) {
            String a = in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            String d = in.nextLine();
            String e = in.nextLine();
            String f = in.nextLine();

            String[] a1 = a.split(" ");
            String[] b1 = b.split(" ");
            String[] c1 = c.split(" ");
            String[] d1 = d.split(" ");
            String[] e1 = e.split(" ");
            String[] f1 = f.split(" ");

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder();
            StringBuilder sb6 = new StringBuilder();

            if (Integer.parseInt(a1[0]) > Integer.parseInt(a1[1])){
                sb1.append(a1[1]).append("+").append(a1[0]);
            }else{
                sb1.append(a1[0]).append("+").append(a1[1]);
            }

            if (Integer.parseInt(b1[0]) > Integer.parseInt(b1[1])){
                sb2.append(b1[1]).append("+").append(b1[0]);
            }else{
                sb2.append(b1[0]).append("+").append(b1[1]);
            }

            if (Integer.parseInt(c1[0]) > Integer.parseInt(c1[1])){
                sb3.append(c1[1]).append("+").append(c1[0]);
            }else{
                sb3.append(c1[0]).append("+").append(c1[1]);
            }

            if (Integer.parseInt(d1[0]) > Integer.parseInt(d1[1])){
                sb4.append(d1[1]).append("+").append(d1[0]);
            }else{
                sb4.append(d1[0]).append("+").append(d1[1]);
            }

            if (Integer.parseInt(e1[0]) > Integer.parseInt(e1[1])){
                sb5.append(e1[1]).append("+").append(e1[0]);
            }else{
                sb5.append(e1[0]).append("+").append(e1[1]);
            }

            if (Integer.parseInt(f1[0]) > Integer.parseInt(f1[1])){
                sb6.append(f1[1]).append("+").append(f1[0]);
            }else{
                sb6.append(f1[0]).append("+").append(f1[1]);
            }

            String s1 = sb1.toString();
            String s2 = sb2.toString();
            String s3 = sb3.toString();
            String s4 = sb4.toString();
            String s5 = sb5.toString();
            String s6 = sb6.toString();

            HashMap<String, Integer> hash = new HashMap<>();

            for (int i = 0; i< 6;i++){
                if (i==0){
                    if (hash.containsKey(s1) ){
                        int  tmp = hash.get(s1);
                        tmp++;
                        hash.put(s1,tmp);
                    }else{
                        hash.put(s1,1);
                    }
                }

                if (i==1){
                    if (hash.containsKey(s2) ){
                        int  tmp = hash.get(s2);
                        tmp++;
                        hash.put(s2,tmp);
                    }else{
                        hash.put(s2,1);
                    }
                }

                if (i==2){
                    if (hash.containsKey(s3) ){
                        int  tmp = hash.get(s3);
                        tmp++;
                        hash.put(s3,tmp);
                    }else{
                        hash.put(s3,1);
                    }
                }

                if (i==3){
                    if (hash.containsKey(s4) ){
                        int  tmp = hash.get(s4);
                        tmp++;
                        hash.put(s4,tmp);
                    }else{
                        hash.put(s4,1);
                    }
                }

                if (i==4){
                    if (hash.containsKey(s5) ){
                        int  tmp = hash.get(s5);
                        tmp++;
                        hash.put(s5,tmp);
                    }else{
                        hash.put(s5,1);
                    }
                }

                if (i==5){
                    if (hash.containsKey(s6) ){
                        int  tmp = hash.get(s6);
                        tmp++;
                        hash.put(s6,tmp);
                    }else{
                        hash.put(s6,1);
                    }
                }

            }

            // count
            Set<String> key = hash.keySet();
            Iterator<String> iterator = key.iterator();
            int count =0;
            while (iterator.hasNext()){
                String next = iterator.next();
                Integer tmp = hash.get(next);
                if (tmp%2 != 0){
                    count++;
                }
            }


            if (count == 0){
                System.out.println("POSSIBLE");
            }else{
                System.out.println("IMPOSSIBLE");
            }
        }

    }

}
