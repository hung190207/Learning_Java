package lc.p3232_find_if_digit_game_can_be_won;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 10}, false)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] nums, boolean expected) {
        assertEquals(expected, new Solution().canAliceWin(nums));

    }
}