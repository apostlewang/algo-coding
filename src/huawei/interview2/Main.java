package huawei.interview2;
//https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
import java.util.*;

public class Main {
    static void clean(String str){
        Stack <Character> stack = new Stack<>();
        stack.push(str.charAt(0));
        char currentCleaned = '`';
        for (int i = 1; i < str.length(); i++) {
            if(stack.empty()&&str.charAt(i)!=currentCleaned){
                stack.push(str.charAt(i));
                currentCleaned = '`';
            }else if (stack.empty()&&str.charAt(i)==currentCleaned){
                //do nothing
            }
            else{
                char peekChar = stack.peek();
                if (str.charAt(i) == peekChar){
                    //2个连续的消除
                    stack.pop();
                    currentCleaned = str.charAt(i);
                }else if(str.charAt(i) == currentCleaned){
                    //2个以上消除
                    //不入
                }else {
                    stack.push(str.charAt(i));
                    currentCleaned = '`';
                }
            }
        }
        System.out.println(stack);
    }
    public static void main(String[] args) {
        clean("abbc");
        clean("abba");
        clean("aabba");
        clean("aaabb");
        clean("aaba");
    }
}
