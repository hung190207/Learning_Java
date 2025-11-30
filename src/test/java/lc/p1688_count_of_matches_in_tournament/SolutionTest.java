package lc.p1688_count_of_matches_in_tournament;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(7, 6)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int n, int expected) {
        assertEquals(expected, new Solution().numberOfMatches(n));
    }


}