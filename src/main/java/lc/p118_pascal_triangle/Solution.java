package lc.p118_pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(List.of(1));
            return result;
        }
        List<List<Integer>> result = generate(numRows - 1);
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(1);
        }
        for (int i = 1; i < numRows - 1; i++) {
            row.set(i, result.get(numRows - 2).get(i - 1) + result.get(numRows - 2).get(i));
        }
        result.add(row);
        return result;
    }
}
