package hw.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        CellState[][] board = new CellState[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = CellState.__;
            }
        }
        show(board);
        int turn = 9;
        while (turn != 0) {
            int row;
            int col;
            do {
                System.out.print("Input: row = ");
                row = sc.nextInt();
                System.out.print("Input: col = ");
                col = sc.nextInt();
                if (!game.isValidMove(board, row, col)) {
                    System.out.println("Invalid move!");
                }
            } while (!game.isValidMove(board, row, col));

            if (turn % 2 == 0) {
                board[row][col] = CellState.O;
            } else {
                board[row][col] = CellState.X;
            }
            show(board);
            turn--;
            if (game.isValidMove(board, row, col)) {

            }
            Player winner = game.hasWinner(board);
            if (winner == Player.X) {
                System.out.println("X won");
                break;
            } else if (winner == Player.O) {
                System.out.println("O won");
                break;
            }
            if (isDraw(board)) {
                System.out.println("Draw!");
                break;
            }
        }
        sc.close();
    }

    private Player hasWinner(CellState[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != CellState.__ && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return (board[i][0] == CellState.X) ? Player.X : Player.O;
            }
            if (board[0][i] != CellState.__ && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return (board[0][i] == CellState.X) ? Player.X : Player.O;
            }
        }
        if (board[1][1] != CellState.__ &&
                (board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
            return board[1][1] == CellState.X ? Player.X : Player.O;
        }
        return null;
    }

    private static boolean isDraw(CellState[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == CellState.__) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void show(CellState[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    private boolean isValidMove(CellState[][] board, int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }
        if (board[row][col] != CellState.__) {
            return false;
        }
        return true;
    }

    private enum Player {
        X, O
    }

    private enum CellState {
        __, X, O
    }
}
