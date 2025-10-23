package hw.tictactoe;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static hw.tictactoe.TicTacToeFuncs.hasWinner;

public class Bot {
    public static final Random random = new Random();

    public static int[] findWinMove(CellState[][] board, CellState player) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == CellState.__) {
                    board[i][j] = player;
                    Player winner = hasWinner(board);
                    board[i][j] = CellState.__;
                    if ((player == CellState.X && winner == Player.X) || (player == CellState.O && winner == Player.O)) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

    public static void clearInput() throws IOException {
        while (System.in.available() > 0) {
            System.in.read();
        }
    }

    public static int[] easyMove(CellState[][] board) {
        List<int[]> emptyMoves = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == CellState.__) {
                    emptyMoves.add(new int[]{i, j});
                }
            }
        }
        return emptyMoves.isEmpty() ? null : emptyMoves.get(random.nextInt(emptyMoves.size()));
    }

    public static int[] mediumMove(CellState[][] board) {
        int[] winMove = findWinMove(board, CellState.O);
        if (winMove != null) return winMove;
        int[] blockMove = findWinMove(board, CellState.X);
        if (blockMove != null) return blockMove;
        if (board[1][1] == CellState.__) {
            return new int[]{1, 1};
        }
        return easyMove(board);
    }

    public static int[] getBotMove(CellState[][] board, BotDifficulty botDifficulty) {
        switch (botDifficulty) {
            case NONE:
                return easyMove(board);
            case HARD:
                if (random.nextInt(100) < 50) {
                    int[] medMove = mediumMove(board);
                    return medMove != null ? medMove : easyMove(board);
                }
                return easyMove(board);
            default:
                return easyMove(board);
        }
    }
}
