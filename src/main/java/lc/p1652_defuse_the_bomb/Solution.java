package lc.p1652_defuse_the_bomb;

// https://leetcode.com/problems/defuse-the-bomb/
public class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        if (k == 0) {
            return res;
        } else if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    int idx = (i + j) % code.length;
                    sum += code[idx];
                    res[i] = sum;
                }
            }
        } else {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= -k; j++) {
                    int idx = (i - j + code.length) % code.length;
                    sum += code[idx];
                    res[i] = sum;
                }
            }
        }
        return res;
    }
}
