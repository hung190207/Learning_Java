package lc.p1652_defuse_the_bomb;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{5, 7, 1, 4}, 3, new int[]{12, 10, 16, 13})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(int[] code, int k, int[] expected) {
        assertArrayEquals(expected, new Solution().decrypt(code, k));
    }
}