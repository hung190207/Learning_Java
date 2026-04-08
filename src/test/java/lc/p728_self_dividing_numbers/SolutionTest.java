package lc.p728_self_dividing_numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1, 22, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22))
                );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int left, int right, List<Integer> expected) {
        assertEquals(expected, new Solution().selfDividingNumbers(left, right));
    }
}