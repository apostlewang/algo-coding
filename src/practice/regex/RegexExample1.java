package practice.regex;
import java.util.regex.*;
public class RegexExample1 {
    public static void main(String[] args) {
        String content = "csbcloverbk";
        String target1 = "clover";
        boolean isMatch = Pattern.matches(target1, content);
        System.out.println(isMatch);

        // *前要加一个.否则会出现报错
        // Dangling meta character '*' near index 0
        String target2 = ".*clover.*";
        System.out.println(Pattern.matches(target2, content));
    }
}
