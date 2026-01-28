package lc.p3731_find_missing_elements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 2, 5}, List.of(3))
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] nums, List<Integer> expected) {
        assertEquals(expected, new Solution().findMissingElements(nums));
    }
}