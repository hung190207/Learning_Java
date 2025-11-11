package lc.p3280_convert_date_to_binary;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("2080-02-29", "100000100000-10-11101")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(String date, String expected) {
        String actual = new Solution().convertDateToBinary(date);
        assertEquals(expected, actual);
    }
}