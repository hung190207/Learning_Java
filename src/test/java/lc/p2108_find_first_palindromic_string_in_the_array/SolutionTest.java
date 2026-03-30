package lc.p2108_find_first_palindromic_string_in_the_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{"abc", "car", "ada", "racecar", "cool"}, "ada")
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void test(String[] words, String expected) {
        assertEquals(expected, new Solution().firstPalindrome(words));

    }
}