package lc.p728_self_dividing_numbers;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp = i;
            int d;
            while (temp > 0) {
                if (temp % 10 == 0 || i % (temp % 10) != 0) {
                    break;
                }
                temp /= 10;
            }
            if (temp == 0) res.add(i);
        }
        return res;
    }
}
