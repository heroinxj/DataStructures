package paper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/22.
 */
public class ReadTxt {
    public static String txt2String(File file) {
        StringBuilder result = new StringBuilder();
        List<StringBuilder> list = new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {
            StringBuilder stringBuilder = list.get(i);
            System.out.println(stringBuilder.toString());
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s=null;
            while ((s = br.readLine()) != null) {

                result.append(System.lineSeparator()+s);
                list.add(result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
