package lc.p1051_height_checker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 4, 2, 1, 3}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] heights, int expected) {
        assertEquals(expected, new Solution().heightChecker(heights));
    }
}