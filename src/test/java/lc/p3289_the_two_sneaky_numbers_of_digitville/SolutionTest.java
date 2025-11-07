package lc.p3289_the_two_sneaky_numbers_of_digitville;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 1, 0}, new int[]{0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] nums, int[] expected) {
        int[] actual = new Solution().getSneakyNumbers(nums);
        assertArrayEquals(expected, actual);
    }
}