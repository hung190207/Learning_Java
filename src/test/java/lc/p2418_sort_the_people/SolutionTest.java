package lc.p2418_sort_the_people;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{"IEO", "Sgizfdfrims", "QTASHKQ", "Vk", "RPJOFYZUBFSIYp", "EPCFFt", "VOYGWWNCf", "WSpmqvb"},
                        new int[]{17233, 32521, 14087, 42738, 46669, 65662, 43204, 8224},
                        new String[]{"EPCFFt","RPJOFYZUBFSIYp","VOYGWWNCf","Vk","Sgizfdfrims","IEO","QTASHKQ","WSpmqvb"})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(String[] names, int[] heights, String[] expected) {
        assertArrayEquals(expected, new Solution().sortPeople(names, heights));
    }
}