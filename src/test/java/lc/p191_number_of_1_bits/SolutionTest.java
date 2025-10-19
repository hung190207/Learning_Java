package lc.p191_number_of_1_bits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(11, 3),
                Arguments.of(128, 1),
                Arguments.of(2147483645, 30)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int n, int expected) {
        assertEquals(expected, new Solution().hammingWeight(n));
    }

}