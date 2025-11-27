package lc.p1637_widest_vertical_area_between_two_points_containning_no_points;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[][]{{8, 7}, {9, 9}, {7, 4}, {9, 7}}, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[][] points, int expected) {
        int actual = new Solution().maxWidthOfVerticalArea(points);
        assertEquals(expected, actual);
    }

}