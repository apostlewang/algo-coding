package nowcoder.hj.hj7;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextFloat()) { // 注意 while 处理多个 case
            float a = in.nextFloat();
            int a_tran = (int) a;
            float pivot = a_tran + 0.5f;
//            System.out.println(pivot);
            if (a >= pivot){
                System.out.println(a_tran+1);
            }
            else {
                System.out.println(a_tran);
            }
        }
    }
}
