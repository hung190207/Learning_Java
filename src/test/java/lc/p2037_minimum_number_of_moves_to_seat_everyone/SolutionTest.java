package lc.p2037_minimum_number_of_moves_to_seat_everyone;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 1, 5}, new int[]{2, 7, 4}, 4)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] seats, int[] students, int expected) {
        int actual = new Solution().minMovesToSeat(seats, students);
        assertEquals(expected, actual);
    }
}