package lc.p2769_find_the_maximum_achievable_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(4, 1, 6),
                Arguments.of(3, 2, 7)
        );
    }
    @ParameterizedTest
    @MethodSource("test")
    void maxAchivalbe(int num,int t, int expected) {
        int actual = new Solution().theMaximumAchievableX(num,t);
        assertEquals(expected, actual);
    }
}