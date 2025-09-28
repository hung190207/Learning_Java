package lc.p20_valid_parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char c1 = stack.pop();
                if (c == ')' && c1 != '(') {
                    return false;
                }
                if (c == ']' && c1 != '[') {
                    return false;
                }
                if (c == '}' && c1 != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
