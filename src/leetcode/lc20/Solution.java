package leetcode.lc20;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '('|chars[i] == '['|chars[i] == '{'){
                stack.push(chars[i]);
            }else {
                if(stack.empty()){
                    return false;
                }
                if(chars[i] == ')' && stack.peek()=='('){
                    stack.pop();
                }else if(chars[i] == ']' && stack.peek()=='['){
                    stack.pop();
                }else if(chars[i] == '}' && stack.peek()=='{'){
                    stack.pop();}
                else {
                    return false;
                }
            }
        }
        if (stack.empty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().isValid("(]"));
        System.out.println(new Solution().isValid("()[]{}"));
    }


}
