package nc.two_sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 5, 6}, 7, new int[]{0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] nums, int target, int[] expect) {
        int[] actual = new Solution().twoSum(nums, target);
        Assertions.assertArrayEquals(expect, actual);
    }
}