package lc.p3194_minimum_average_of_smallest_and_largest_elements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{7, 8, 3, 4, 15, 13, 4, 1}, 5.5000)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, double expected) {
        assertEquals(expected, new Solution().minimumAverage(nums));
    }
}