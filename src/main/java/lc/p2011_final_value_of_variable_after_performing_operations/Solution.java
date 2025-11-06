package lc.p2011_final_value_of_variable_after_performing_operations;

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.equals("--X") || operation.equals("X--")) x--;
            else if (operation.equals("++X") || operation.equals("X++")) x++;
        }
        return x;
    }
}
