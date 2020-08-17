package day200816;

import java.util.Scanner;

/**
 * @author Heroin X
 * @date 2020/8/16 14:56
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.replace("\t",",");
        str=str.replace(" ",",");
        String[] sp = str.split(",");
        int size = sp.length;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < size-2; i++){
            if (sp[i].equals("undo")||sp[i].equals("redo")){
                continue;
            }
            if (sp[i+1].equals("undo")){
                if (sp[i+2].equals("redo")){
                    sb.append(sp[i]).append(" ");
                }
            }else{
                sb.append(sp[i]).append(" ");
            }
        }

        for (int i = size-2; i<size-1;i++){
            if (sp[i].equals("undo")||sp[i].equals("redo")){
                continue;
            }
            sb.append(sp[i]).append(" ");
        }

        if (!sp[size-1].equals("undo")&& !sp[size-1].equals("redo")){
            sb.append(sp[size-1]);
        }


        System.out.println(sb.toString());


    }


}
