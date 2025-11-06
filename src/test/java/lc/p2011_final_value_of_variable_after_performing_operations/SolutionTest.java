package lc.p2011_final_value_of_variable_after_performing_operations;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{"--X", "++X"}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void finalVal(String[] operations, int expected) {
        int actual = new Solution().finalValueAfterOperations(operations);
        assertEquals(expected, actual);
    }
}