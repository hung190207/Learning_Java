package lc.p3683_earlistest_time_to_finish_one_task;

// https://leetcode.com/problems/earliest-time-to-finish-one-task/description/
public class Solution {
    public int earliestTime(int[][] tasks) {
        int res = Integer.MAX_VALUE;
        for (int[] task : tasks) {
            res = Math.min(res, task[0] + task[1]);
        }
        return res;
    }
}
