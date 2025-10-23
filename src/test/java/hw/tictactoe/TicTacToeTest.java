package hw.tictactoe;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static hw.tictactoe.CellState.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TicTacToeTest {
    public static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new CellState[][]{
                        {X, X, X},
                        {O, O, __},
                        {__, __, __}
                }, Player.X),
                Arguments.of(new CellState[][]{
                        {X, O, __},
                        {X, O, __},
                        {X, __, __}
                }, Player.X), Arguments.of(new CellState[][]{
                        {__, X, O},
                        {X, __, O},
                        {X, X, O}
                }, Player.O),
                Arguments.of(new CellState[][]{
                        {X, X, __},
                        {O, O, O},
                        {X, __, __}
                }, Player.O),
                Arguments.of(new CellState[][]{
                        {X, O, __},
                        {O, X, O},
                        {X, __, X}
                }, Player.X),
                Arguments.of(new CellState[][]{
                        {X, X, O},
                        {X, O, O},
                        {O, X, X}
                }, Player.O)
        );
    }

    @ParameterizedTest
    @MethodSource("test")
    void hasWinner(CellState[][] board, Object expected) {
        Object actual = TicTacToeFuncs.hasWinner(board);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> test1() {
        return Stream.of(
                Arguments.of(new CellState[][]{
                        {X, X, O},
                        {O, O, X},
                        {O, X, X}
                }, true),
                Arguments.of(new CellState[][]{
                        {X, X, O},
                        {O, __, X},
                        {O, X, __}
                }, false)
        );
    }

    @ParameterizedTest
    @MethodSource("test1")
    void isDraw(CellState[][] board, boolean expected) {
        boolean actual = TicTacToeFuncs.isDraw(board);
        assertEquals(expected, actual);
    }

    static Stream<Arguments> test2() {
        return Stream.of(
                Arguments.of(new CellState[][]{
                        {__, X, __},
                        {__, X, O},
                        {__, __, __}
                }, X, new int[]{2, 1}),
                Arguments.of(new CellState[][]{
                        {O, O, __},
                        {X, __, __},
                        {__, __, __}
                }, O, new int[]{0, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("test2")
    void findWinMove(CellState[][] board, CellState player, int[] expected) {
        int[] actual = Bot.findWinMove(board, player);
        assertArrayEquals(expected, actual);
    }
}