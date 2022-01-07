package hj.hj003;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;


// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            int[] numbers = new int[n];
            TreeSet<Integer> treeSet = new TreeSet<>();
            for (int i=0;i<n;i++){
                numbers[i] = in.nextInt();
            }
            for (int i=0;i<n;i++){
                treeSet.add(numbers[i]);
            }
            Integer[] treeSetArray = new Integer[treeSet.size()];
            treeSet.toArray(treeSetArray);
            Arrays.sort(treeSetArray);
            for (int i = 0; i < treeSetArray.length; i++) {
                System.out.println(treeSetArray[i]);
            }
        }
    }
}
