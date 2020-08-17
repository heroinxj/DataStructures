package day200815;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  讯飞
 *
 * @author Heroin X
 * @date 2020/8/15 19:07
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] split = s.split(" ");
        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            list.add(sc.nextLine());
        }

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++){
            String[] sp = list.get(i).split(" ");
            for (int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(sp[j]);
            }
        }

        int max = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){

                for (int x = 0; x < m; x++){
                    if (x == i){
                        continue;
                    }
                    for (int y = 0; y < n;y++){
                        if (y == j){
                            continue;
                        }
                        int temp = arr[i][j] * arr[x][y];
                        if (temp > max){
                            max = temp;
                        }

                    }
                }
            }
        }

        System.out.println(max);

    }
}
