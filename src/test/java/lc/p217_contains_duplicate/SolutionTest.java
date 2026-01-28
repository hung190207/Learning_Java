package lc.p217_contains_duplicate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 1}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] nums, boolean expected) {
        assertEquals(expected, new Solution().containsDuplicate(nums));

    }
}