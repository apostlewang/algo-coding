package nowcoder.hj.hj97;

import java.util.ArrayList;
import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            ArrayList<Integer> integers = new ArrayList<>();
            ArrayList<Integer> positives = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                integers.add(in.nextInt());
            }
            int num_negatives = 0;
            int num_positives = 0;
            long sum_pos = 0;

            for (int i = 0; i < integers.size(); i++) {
                if(integers.get(i) > 0) {
                    sum_pos += integers.get(i);
                    num_positives ++;
                }
                else if(integers.get(i) < 0){
                    num_negatives ++;
                }
            }
            System.out.println(num_negatives + " " + String.format("%.1f",(float)sum_pos/(float) num_positives));

        }
    }
}
