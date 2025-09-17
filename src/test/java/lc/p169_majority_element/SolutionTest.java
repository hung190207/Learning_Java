package lc.p169_majority_element;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{2,2,1,1,1,2,2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void majorityElement(int[] nums, int expected) {
        int actual = new Solution().MajorityElement(nums);
        assertEquals(expected, actual);
    }
}