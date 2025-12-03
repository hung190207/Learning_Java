package lc.p2859_sum_of_values_at_indices_with_k_set_bits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of(5, 10, 1, 5, 2), 1, 13)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(List<Integer> nums, int k, int expected) {
        int actual = new Solution().sumIndicesWithKSetBits(nums, k);
        assertEquals(expected, actual);
    }

}