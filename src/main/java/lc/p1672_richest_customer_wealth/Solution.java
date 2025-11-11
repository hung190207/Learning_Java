package lc.p1672_richest_customer_wealth;

// https://leetcode.com/problems/richest-customer-wealth/
public class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > res) {
                res = sum;
            }
        }
        return res;
    }
}
