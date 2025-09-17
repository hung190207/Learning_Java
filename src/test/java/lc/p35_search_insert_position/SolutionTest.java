package lc.p35_search_insert_position;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 5, 6}, 5, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void searchInsert(int[] arr, int target, int want) {
        int actual = new Solution().searchInsert(arr, target);
        assertEquals(want, actual);
    }
}