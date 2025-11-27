package lc.p1637_widest_vertical_area_between_two_points_containning_no_points;

import java.util.Arrays;

// https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description/
public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int len = points.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < len - 1; i++) {
            res = Math.max(res, (arr[i + 1] - arr[i]));
        }
        return res;
    }
}
