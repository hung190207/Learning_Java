package lc.p2160_minimum_sum_of_four_digit_number_after_splitting_digits;

import java.util.Arrays;

// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/description/
public class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(arr);
        return (arr[0] * 10 + arr[2]) + (arr[1] * 10 + arr[3]);
    }
}