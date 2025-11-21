package lc.p1365_how_many_numbers_are_smaller_than_the_current_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{8, 1, 2, 2, 3}, new int[]{4, 0, 1, 1, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int[] expected) {
        int[] actual = new Solution().smallerNumbersThanCurrent(nums);
        assertArrayEquals(expected, actual);
    }
}