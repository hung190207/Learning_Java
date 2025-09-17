package lc.p26_remove_duplicates_from_sorted_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 2),
                Arguments.of(new int[]{0,0,1,1,1,2,2,3,3,4}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void removeDuplicates(int[] arr, int want) {
        int actual = new Solution().removeDuplicates(arr);
        assertArrayEquals(want, actual);
    }

    private void assertArrayEquals(int want, int actual) {
    }
}