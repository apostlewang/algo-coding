package huawei.p3;

import java.util.Random;
import java.util.Scanner;

// 实现一个（add 123 343）
// （mul add（12 234）23）
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String n = in.nextLine();
            Random random = new Random();
            if (random.nextInt() >0){
                System.out.println("error");
            }
            else {
                System.out.println(1);
            }


        }
    }
}
