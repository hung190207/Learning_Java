package lc.p1732_find_the_highest_altitude;

import java.util.Arrays;

public class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int[] res = new int[gain.length + 1];
        res[0] = 0;
        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            res[i + 1] = sum;
        }
        Arrays.sort(res);
        return res[gain.length + 1];
    }
}
