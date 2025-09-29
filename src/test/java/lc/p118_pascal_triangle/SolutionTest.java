package lc.p118_pascal_triangle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(1, List.of(List.of(1))),
                Arguments.of(5, List.of(
                        List.of(1),
                        List.of(1, 1),
                        List.of(1, 2, 1),
                        List.of(1, 3, 3, 1),
                        List.of(1, 4, 6, 4, 1)))
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void pascalTriangle(int n, List<List<Integer>> expected) {
        List<List<Integer>> actual = new Solution().generate(n);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }

}