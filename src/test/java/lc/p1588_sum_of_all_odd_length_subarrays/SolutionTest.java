package lc.p1588_sum_of_all_odd_length_subarrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 2, 5, 3}, 58)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] arrays, int expected) {
        assertEquals(expected, new Solution().sumOddLengthSubarrays(arrays));
    }
}