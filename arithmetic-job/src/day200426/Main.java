package day200426;

import java.util.*;

/**
 * 快手-1
 *
 *
 10
 http://google.ru/test
 http://google.ru/
 http://google.com
 http://google.com/test
 http://google.de/
 http://google.ru/test
 http://google.de/test
 http://google.com/
 http://google.com/t
 http://google.com/test
 *
 * @author Heroin X
 * @date 2020/4/26 15:55
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n  = Integer.parseInt(in.nextLine().trim());
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0;i < n; i++){
            list.add(in.nextLine().split("http://")[1]);
        }

        HashMap<String, List<String>> hash = new HashMap<>();
        ArrayList<String>  setList = new ArrayList<>();
        for(int i=0;i<n;i++){

            ArrayList<String> list1 = new ArrayList<>();
            String s = list.get(i);
            String s1 =null;
            if (s.contains("/")){
                String[] arr  = s.split("/");
                s1 = arr[0];

                if(hash.containsKey(s1)){
                    continue;
                }

                StringBuilder s2 = new StringBuilder();
                for (int k = 1; k<arr.length;k++){
                    s2.append(arr[k]);
                }
                String s3 = s2.toString();
                list1.add(s3);
            }else{
                s1 = s;
                list1.add(" ");
            }

            if (!setList.contains(s1)){
                setList.add(s1);
            }


            for (int j = i+1;j<n;j++){
                String tmp = list.get(j);
                if (tmp.contains("/")){
                    String[] split = tmp.split("/");
                    if (split[0].equals(s1)){
                        StringBuilder s4 = new StringBuilder();
                        for (int k = 1; k<split.length;k++){
                            s4.append(split[k]);
                        }
                        String s5 = s4.toString();
                        if(!list1.contains(s5)){
                            list1.add(s5);
                        }


                    }
                }else{
                    if (tmp.equals(s1)){
                        list1.add(" ");
                    }
                }

            }

            hash.put(s1,list1);
        }

//
//+





        for (int i =0; i< setList.size();i++){
            ArrayList<String> res = new ArrayList<>();
            String tmp1 = setList.get(i);
            res.add(tmp1);
            List<String> s1= hash.get(tmp1);
            for (int j = i+1;j < setList.size();j++){

                String tmp2 = setList.get(j);
                List<String> s2 = hash.get(tmp2);

                if (isSame(s1,s2)){
                    res.add(tmp2);
                    setList.remove(tmp2);
                }
            }

            int size = res.size();
            if (size>1){
                System.out.print("http://"+res.get(0)+" ");
                for (int x =1;x< res.size();x++){
                    System.out.print("http://"+res.get(x));
                }
                System.out.println();
            }


        }
    }

    private static boolean isSame(List<String> list1,List<String> list2){

        if (list1.size()!=list2.size()){
            return false;
        }

        for (int i = 0; i < list1.size();i++){
            if (!list2.contains(list1.get(i))){
                return false;
            }
        }
        return true;
    }
}
