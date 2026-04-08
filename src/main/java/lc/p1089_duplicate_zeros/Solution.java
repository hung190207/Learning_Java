package lc.p1089_duplicate_zeros;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/duplicate-zeros/description/
public class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int j = 0;
        for (int i = 0; i < n && j < n; i++) {
            res[j++] = arr[i];
            if (arr[i] == 0 && j < n) {
                res[j++] = 0;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = res[i];
        }
    }
}
