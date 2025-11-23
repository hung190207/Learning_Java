package lc.p1486_XOR_operation_in_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(5, 0, 8)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int n, int start, int expected) {
        int actual = new Solution().xorOperation(n, start);
        assertEquals(expected, actual);
    }
}