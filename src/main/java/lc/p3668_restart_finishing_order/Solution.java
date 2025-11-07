package lc.p3668_restart_finishing_order;

//  https://leetcode.com/problems/restore-finishing-order/description/
public class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];
        int index = 0;
        for (int j : order) {
            for (int friend : friends) {
                if (j == friend) {
                    res[index++] = j;
                    break;
                }
            }
        }
        return res;
    }
}