package lc.p190_reverse_bits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(43261596, 964176192),
                Arguments.of(2147483644, 1073741822)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int num, int expected) {
        int actual = new Solution().reverseBits(num);
        Assertions.assertEquals(expected, actual);
    }

}