package lc.p3688_bitwise_or_of_even_numbers_in_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int expected) {
        assertEquals(expected, new Solution().evenNumberBitwiseORs(nums));
    }
}