package lc.p1431_kids_with_the_greatest_number_of_candies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{2, 3, 5, 1, 3}, 3,
                        List.of(true, true, true, false, true))
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] candies, int extraCandies, List<Boolean> expected) {
        List<Boolean> actual = new Solution().kidsWithCandies(candies, extraCandies);
        assertEquals(expected, actual);
    }
}