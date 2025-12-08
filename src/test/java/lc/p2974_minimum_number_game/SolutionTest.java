package lc.p2974_minimum_number_game;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{5, 4, 2, 3}, new int[]{3, 2, 5, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int[] expected) {
        assertArrayEquals(expected, new Solution().numberGame(nums));
    }
}