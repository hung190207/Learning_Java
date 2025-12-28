package lc.p3688_bitwise_or_of_even_numbers_in_an_array;

// https://leetcode.com/problems/bitwise-or-of-even-numbers-in-an-array/description/
public class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int res = 0;
        for (int num : nums) {
            if (num % 2 == 0) res = res | num;
        }
        return res;
    }
}
