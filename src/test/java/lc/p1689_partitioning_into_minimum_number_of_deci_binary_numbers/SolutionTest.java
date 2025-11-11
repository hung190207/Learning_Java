package lc.p1689_partitioning_into_minimum_number_of_deci_binary_numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("32", 3),
                Arguments.of("82734", 8)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(String n, int expected) {
        int actual = new Solution().minPartitions(n);
        assertEquals(expected, actual);
    }
}