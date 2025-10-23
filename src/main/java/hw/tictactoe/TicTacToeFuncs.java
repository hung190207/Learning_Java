package hw.tictactoe;

public class TicTacToeFuncs {
    public static Player hasWinner(CellState[][] board) {
        for (int i = 0; i < board.length; i++) {
            // check horizontal lines
            if (board[i][0] != CellState.__ && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return (board[i][0] == CellState.X) ? Player.X : Player.O;
            }

            // check vertical lines
            if (board[0][i] != CellState.__ && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return (board[0][i] == CellState.X) ? Player.X : Player.O;
            }
        }
        // check diagonals
        if (board[1][1] != CellState.__ && ((board[0][0] == board[1][1] && board[1][1] == board[2][2]) || (board[0][2] == board[1][1] && board[1][1] == board[2][0]))) {
            return board[1][1] == CellState.X ? Player.X : Player.O;
        }

        return null;
    }

    public static boolean isDraw(CellState[][] board) {
        for (CellState[] cellStates : board) {
            for (int j = 0; j < board.length; j++) {
                if (cellStates[j] == CellState.__) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void showPlaying(CellState[][] board, int crow, int ccol) {
        System.out.println("  0   1    2");
        for (int i = 0; i < board.length; i++) {
            System.out.println(i + " ");
            for (int j = 0; j < board[0].length; j++) {
                boolean isCursor = (i == crow && j == ccol);
                String cell;
                if (board[i][j] == CellState.X) {
                    cell = ConsoleColor.BLUE.getAnsiCode() + " X " + ConsoleColor.RESET.getAnsiCode();
                } else if (board[i][j] == CellState.O) {
                    cell = ConsoleColor.RED.getAnsiCode() + " O " + ConsoleColor.RESET.getAnsiCode();
                } else {
                    cell = "  ";
                }
                if (isCursor) {
                    System.out.print(ConsoleColor.MAGENTA.getAnsiCode() + "[" + ConsoleColor.RESET.getAnsiCode() + cell + ConsoleColor.MAGENTA.getAnsiCode() + "]" + ConsoleColor.RESET.getAnsiCode());
                } else {
                    System.out.print(" " + cell + " ");
                }
                if (j < board[0].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < board.length - 1) {
                System.out.println(" " + "-".repeat(11));
            }
        }
    }

    public static void showRes(CellState[][] board) {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == CellState.X) {
                    System.out.print(ConsoleColor.BLUE.getAnsiCode() + board[row][col] + ConsoleColor.RESET.getAnsiCode() + " ");
                } else if (board[row][col] == CellState.O) {
                    System.out.print(ConsoleColor.RED.getAnsiCode() + board[row][col] + ConsoleColor.RESET.getAnsiCode() + " ");
                } else {
                    System.out.print(board[row][col] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void clearConsole() {
        System.out.print("\n".repeat(50));
        System.out.flush();
    }
}
