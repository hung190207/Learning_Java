package lc.p2535_difference_between_element_sum_and_digit_sum_of_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 15, 6, 3}, 9)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int expected) {
        assertEquals(expected, new Solution().differenceOfSum(nums));
    }
}