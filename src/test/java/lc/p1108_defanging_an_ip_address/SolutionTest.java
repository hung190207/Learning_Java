package lc.p1108_defanging_an_ip_address;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("1.1.1.1", "1[.]1[.]1[.]1")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void testing(String address, String expected) {
        String actual = new Solution().defangIPaddr(address);
        assertEquals(expected, actual);
    }
}