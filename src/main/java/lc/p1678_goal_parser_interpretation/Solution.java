package lc.p1678_goal_parser_interpretation;

// https://leetcode.com/problems/goal-parser-interpretation/description/
public class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < command.length()) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
                i++;
            } else if (command.startsWith("()", i)) {
                sb.append('o');
                i += 2;
            } else if (command.startsWith("(al)", i)) {
                sb.append("al");
                i += 4;
            }
        }
        return sb.toString();
    }
}
