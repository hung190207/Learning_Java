package lc.p67_add_binary;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of("11", "1", "100"),
                Arguments.of("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011", "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"),
                Arguments.of("1010", "1011", "10101")
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void addBinary(String a, String b, String want) {
        String actual = new Solution().addBinary(a, b);
        assertEquals(want, actual);
    }
}