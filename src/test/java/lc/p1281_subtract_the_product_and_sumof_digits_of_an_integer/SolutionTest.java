package lc.p1281_subtract_the_product_and_sumof_digits_of_an_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(234, 15)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int n, int expected) {
        int actual = new Solution().subtractProductAndSum(n);
        assertEquals(expected, actual);
    }
}