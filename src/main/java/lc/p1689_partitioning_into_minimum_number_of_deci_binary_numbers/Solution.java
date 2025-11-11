package lc.p1689_partitioning_into_minimum_number_of_deci_binary_numbers;

// https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
public class Solution {
    public int minPartitions(String n) {
        int maxVal = 0;
        for (int i = 0; i < n.length(); i++) {
            int ithVal = n.charAt(i) - '0';
            if (ithVal > maxVal) maxVal = ithVal;
            else i++;
        }
        return maxVal;
    }
}
