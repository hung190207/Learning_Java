package lc.p1464_maximum_product_of_two_elements_in_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{10, 1, 8, 4, 7, 7, 3, 6}, 63)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int expected) {
        assertEquals(expected, new Solution().maxProduct(nums));
    }
}