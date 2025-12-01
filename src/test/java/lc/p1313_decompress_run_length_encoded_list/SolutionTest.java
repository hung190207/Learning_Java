package lc.p1313_decompress_run_length_encoded_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, new int[]{2, 4, 4, 4})
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void main(int[] nums, int[] expected) {
        assertArrayEquals(expected, new Solution().decompressRLElist(nums));
    }
}