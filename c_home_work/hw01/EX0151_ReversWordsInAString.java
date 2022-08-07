package c_home_work.hw01;
//    https://leetcode.com/problems/reverse-words-in-a-string/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EX0151_ReversWordsInAString {
    public static void main(String[] args) {
    // Input: s = "the sky is blue"
    // Output: "blue is sky the"
        String str = reverseWords("the sky is blue");
        System.out.println(str);

    }
    public static String reverseWords(String s) {
        String regex = "\\b\\w+\\b";
        StringBuilder result = new StringBuilder();

        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            result.insert(0, matcher.group(0) + " ");
        }
        result = new StringBuilder(result.substring(0, result.length() - 1));
        return result.toString();
    }
}
