package lc.p1389_create_target_array_in_the_given_order;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 2, 3, 4},
                        new int[]{0, 1, 2, 2, 1},
                        new int[]{0, 4, 1, 3, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int[] index, int[] expected) {
        int[] actual = new Solution().createTargetArray(nums, index);
        assertArrayEquals(expected, actual);
    }
}