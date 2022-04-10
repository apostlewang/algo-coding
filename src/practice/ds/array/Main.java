package practice.ds.array;
/*
使用Java原生数组
 */
public class Main {
    public static void main(String[] args) {

        // Java原生数组初始化（全部初始化为null）
        int[] arr = new int[20];
        // 遍历逐个赋值
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        // 初始化方式2
        int[] scores = new int[]{100, 99, 88};
        // 逐个遍历
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        // 数组的可遍历特性
        for (int score:scores) {
            System.out.println(score);
        }
    }
}
