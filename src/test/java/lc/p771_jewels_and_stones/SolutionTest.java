package lc.p771_jewels_and_stones;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("aA", "aAAbbbb", 3)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(String j, String s, int expected) {
        int actual = new Solution().numJewelsInStones(j, s);
        assertEquals(expected, actual);
    }
}