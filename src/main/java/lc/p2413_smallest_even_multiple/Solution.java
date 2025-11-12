package lc.p2413_smallest_even_multiple;

// https://leetcode.com/problems/smallest-even-multiple/description/
public class Solution {
    public int smallestEvenMultiple(int n) {
        for (int i = n; i <= 2 * n; i += n) {
            if (i % 2 == 0) return i;
        }
        return 2 * n;
    }
}
