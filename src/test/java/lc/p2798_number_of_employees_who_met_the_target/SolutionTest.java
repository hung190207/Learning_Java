package lc.p2798_number_of_employees_who_met_the_target;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{5, 1, 4, 2, 2}, 6, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(int[] hours, int target, int expected) {
        assertEquals(expected, new Solution().numberOfEmployeesWhoMetTarget(hours, target));
    }
}