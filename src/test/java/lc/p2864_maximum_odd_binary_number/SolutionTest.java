package lc.p2864_maximum_odd_binary_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("010", "001")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(String s, String expected) {
        assertEquals(expected, new Solution().maximumOddBinaryNumber(s));
    }
}