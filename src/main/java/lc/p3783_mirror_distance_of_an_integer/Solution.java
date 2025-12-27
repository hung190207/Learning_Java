package lc.p3783_mirror_distance_of_an_integer;

// https://leetcode.com/problems/mirror-distance-of-an-integer/description/
public class Solution {
    public int mirrorDistance(int n) {
        if (n < 10) return 0;
        String numStr = String.valueOf(n);
        StringBuilder sb = new StringBuilder(numStr);
        sb.reverse();
        return Math.abs(n - Integer.parseInt(sb.toString()));
    }
}
