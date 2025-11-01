package lc.p412_fizz_buzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(3, List.of("1", "2", "Fizz")),
                Arguments.of(5, List.of("1", "2", "Fizz", "4", "Buzz"))
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void fizzBuzz(int n, List<String> expected) {
        List<String> actual = new Solution().fizzBuzz(n);
        assertEquals(expected, actual);
    }
}