package lc.p1672_richest_customer_wealth;

// https://leetcode.com/problems/richest-customer-wealth/
public class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > res) {
                res = sum;
            }
        }
        return res;
    }
}
