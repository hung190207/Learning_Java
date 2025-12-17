package lc.p1769_minimum_number_of_operations_to_move_all_balls_to_each_box;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("110", new int[]{1, 1, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(String boxes, int[] expected) {
        assertArrayEquals(expected, new Solution().minOperations(boxes));
    }
}