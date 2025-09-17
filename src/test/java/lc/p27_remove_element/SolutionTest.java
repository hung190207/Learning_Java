package lc.p27_remove_element;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 2, 3}, 3, 2),
                Arguments.of(new int[]{0,1,2,2,3,0,4,2}, 2, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void removeElement(int[] arr, int val, int want) {
        int actual = new Solution().removeElement(arr, val);
        assertEquals(want, actual);
    }
}