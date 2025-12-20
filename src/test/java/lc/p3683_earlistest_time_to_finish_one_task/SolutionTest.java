package lc.p3683_earlistest_time_to_finish_one_task;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[][]{{1, 6}, {2, 3}}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[][] tasks, int expected) {
        assertEquals(expected, new Solution().earliestTime(tasks));
    }
}