package lc.p1346_check_if_N_and_its_double_exist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{10, 2, 5, 3}, true)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] arr, boolean expected) {
        assertEquals(expected, new Solution().checkIfExist(arr));
    }
}