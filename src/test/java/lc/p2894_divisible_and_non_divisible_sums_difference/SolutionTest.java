package lc.p2894_divisible_and_non_divisible_sums_difference;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(10, 3, 19)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void differenceOfSums(int n, int m, int expected) {
        int actual = new Solution().differenceOfSums(n, m);
        assertEquals(expected, actual);
    }
}