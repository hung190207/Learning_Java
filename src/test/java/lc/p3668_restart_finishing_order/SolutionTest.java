package lc.p3668_restart_finishing_order;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 2, 5, 4}, new int[]{1, 3, 4}, new int[]{3, 1, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] order, int[] friends, int[] expected) {
        int[] actual = new Solution().recoverOrder(order, friends);
        assertArrayEquals(expected, actual);
    }
}