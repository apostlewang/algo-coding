package nowcoder.hj.hj8;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int n = in.nextInt();
            TreeMap<Integer, Integer> treeMap = new TreeMap<>();
            int index, value;
            for (int i = 0; i < n; i++) {
                index = in.nextInt();
                value = in.nextInt();
                if(treeMap.containsKey(index)){
                    treeMap.put(index, treeMap.get(index)+value);
                }else {
                    treeMap.put(index,value);
                }
            }
            Iterator iter = treeMap.keySet().iterator();
            while (iter.hasNext()){
                int key = (int)iter.next();
                int v = treeMap.get(key);
                System.out.println(key + " " + v);
            }
        }
    }
}
