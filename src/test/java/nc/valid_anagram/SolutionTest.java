package nc.valid_anagram;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("racecar", "carrace", true),
                Arguments.of("jar", "jam", false)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    public void test(String s, String t, boolean expected) {
        boolean actual = new Solution().isAnagram(s, t);
        assertEquals(expected, actual);
    }

}