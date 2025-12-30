package lc.p1051_height_checker;

import java.util.Arrays;

// https://leetcode.com/problems/height-checker/
public class Solution {
    public int heightChecker(int[] heights) {
        int[] temp = heights.clone();
        Arrays.sort(temp);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != temp[i]) {
                count++;
            }
        }
        return count;
    }
}
