package lc.p3516_find_closest_person;

// https://leetcode.com/problems/find-closest-person/description/
public class Solution {
    public int findClosest(int x, int y, int z) {
        if (Math.abs(z - y) < Math.abs(x - z)) return 2;
        else if (Math.abs(z - y) > Math.abs(x - z)) return 1;
        return 0;
    }
}
