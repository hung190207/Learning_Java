package lc.p3516_find_closest_person;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(2, 7, 4, 1),
                Arguments.of(2, 5, 6, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int x, int y, int z, int expected) {
        int actual = new Solution().findClosest(x, y, z);
        assertEquals(expected, actual);
    }
}