package lc.p2485_find_the_pivot_integer;

// https://leetcode.com/problems/find-the-pivot-integer/description/
public class Solution {
    public int pivotInteger(int n) {
        int sum = n * (n + 1) / 2;
        double a = Math.sqrt(sum);
        if (a - Math.ceil(a) == 0) return (int) a;
        else return -1;
    }
}
