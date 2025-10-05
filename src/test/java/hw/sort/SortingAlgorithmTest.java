package hw.sort;

import hw.utils.ArrayTools;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.InvocationTargetException;
import java.util.stream.Stream;

class SortingAlgorithmTest {

    public static Stream<Arguments> algorithms() {
        return Stream.of(
                Arguments.of(BubbleSort.class),
                Arguments.of(InsertionSort.class),
                Arguments.of(SelectionSort.class)
        );
    }

    private static final int SIZE = 100000;


    @ParameterizedTest
    @MethodSource("algorithms")
    void sort(Class<? extends SortingAlgorithm> algo)
            throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int[] arr = ArrayTools.genRandomInts(SIZE);
        SortingAlgorithm sorter = algo.getDeclaredConstructor().newInstance();
        sorter.sort(arr);
        Assertions.assertTrue(ArrayTools.isSorted(arr));
    }
}