package nc.contains_duplicate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, false),
                Arguments.of(new int[]{1, 2, 4, 4}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] nums, boolean expected) {
        boolean actual = new Solution().hasDuplicate(nums);
        assertEquals(expected, actual);
    }
}