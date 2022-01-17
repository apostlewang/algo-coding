package huawei.p1;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = in.nextInt();
            String str = in.next();
            String[] splitted = str.split("_");
            ArrayList<String> commands = new ArrayList<>();
            for (int i = 0; i < splitted.length; i++) {
                if (splitted[i].length() > 0){
                    commands.add(splitted[i]);
                }
            }
            //System.out.println(commands);
            if (n < commands.size()){
                commands.set(n, "******");
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < commands.size(); i++) {
                    result.append(commands.get(i));
                    if (i != commands.size()-1){
                        result.append("_");
                    }
                }
                System.out.println(result);
            }
            else {
                System.out.println("ERROR");
            }



//            char[] chars = str.toCharArray();
//            int index = 0;
//            while (index < chars.length){
//
//                index++;
//            }
//            if (str == "password__a12345678_timeout_100")
//                {
//                    System.out.println("password_******_timeout_100");
//                }
//            else if(str == "aaa_password_\"a12_45678\"_timeout__100_\"\"_"){
//                System.out.println("aaa_password_******_timeout_100_\"\"");
//            }
//            else {
//                System.out.println("ERROR");
//            }

        }
    }
}
//2
//aaa_password_"a12_45678"_timeout__100_""_