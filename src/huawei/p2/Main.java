package huawei.p2;

import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                hashSet.add(num);
            }
            if (hashSet.contains(1)){
                System.out.println(1);
            }
            else{// 不包含1的情况
                int numColor = 0;
                for (int i = 2; i <= 100; i++) {
                    if(hashSet.contains(i)){
                        numColor++;
                        int clean = i;
                        while (clean <=100){
                            hashSet.remove(clean);
                            if (hashSet.isEmpty()){
                                break;
                            }
                            clean+=i;
                        }
                    }
                    if (hashSet.isEmpty()){
                        break;
                    }
                    //System.out.println(hashSet);
                }
                System.out.println(numColor);
            }
        }
    }
}
