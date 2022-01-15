package nowcoder.hj.hj106;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNext()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            char[] strArr = a.toCharArray();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                result.append(strArr[strArr.length-i-1]);
            }
            System.out.println(result);
        }
    }
}
