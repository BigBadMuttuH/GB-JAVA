// надо доделать
package b_practice.seminar06;

import java.util.SimpleTimeZone;
import java.util.Stack;

public class EX0071_SimplifyPath {
    public static void main(String[] args) {

    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        StringBuilder ans = new StringBuilder();

        String[] tokens = path.split("/");
        for (String token : tokens) {
            if ("..".equals(token)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!".".equals(token) ) {
                if (!token.isBlank()) {
                stack.push(token);
                }
            }

        }
        ans.append("/");

        while (!stack.isEmpty()) {
            ans.append(stack.pop())
               .append("/");
        }
        ans.deleteCharAt(ans.length() - 1   );

        return ans.toString();
    }
}
