package lc.p1672_richest_customer_wealth;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 2, 3}, {3, 2, 1}}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[][] accounts, int expected) {
        int actual = new Solution().maximumWealth(accounts);
        assertEquals(expected, actual);
    }
}