package lc.p3340_check_balanced_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("1234", false)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(String num, boolean expected) {
        assertEquals(expected, new Solution().isBalanced(num));
    }
}