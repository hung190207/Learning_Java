package hw.tictactoe;

import java.io.IOException;

public class TicTacToe {
    public static void main(String[] args) throws IOException {
        CellState[][] board = new CellState[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = CellState.__;
            }
        }
        int crow = 0;
        int ccol = 0;
        int turn = 9;
        while (turn != 0) {
            clearScreen();
            showPlaying(board, crow, ccol);
            System.out.print("Use WASD to move, Press p to place");
            System.out.println();
            System.out.println("Current turn: " + (turn % 2 == 1 ? "X" : "O"));
            char key = (char) System.in.read();
            key = Character.toLowerCase(key);
            switch (key) {
                case 'w':
                    crow = (crow - 1 + 3) % 3;
                    break;
                case 's':
                    crow = (crow + 1) % 3;
                    break;
                case 'a':
                    ccol = (ccol - 1 + 3) % 3;
                    break;
                case 'd':
                    ccol = (ccol + 1) % 3;
                    break;
                case 'p':
                    if (board[crow][ccol] == CellState.__) {
                        if (turn % 2 == 0) {
                            board[crow][ccol] = CellState.O;
                        } else {
                            board[crow][ccol] = CellState.X;
                        }
                        turn--;
                        Player winner = hasWinner(board);
                        if (winner == Player.X) {
                            clearScreen();
                            show(board);
                            System.out.println("\u001B[33m The winner is: X!!\u001B[0m");
                            return;
                        } else if (winner == Player.O) {
                            clearScreen();
                            show(board);
                            System.out.println("\u001B[33m The winner is: O!!\u001B[0m");
                            return;
                        }
                        if (isDraw(board)) {
                            clearScreen();
                            show(board);
                            System.out.println("Draw!");
                            return;
                        }
                        break;
                    }
            }
        }
    }

    static Player hasWinner(CellState[][] board) {
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

    static boolean isDraw(CellState[][] board) {
        for (CellState[] cellStates : board) {
            for (int j = 0; j < board.length; j++) {
                if (cellStates[j] == CellState.__) {
                    return false;
                }
            }
        }
        return true;
    }

    static void showPlaying(CellState[][] board, int crow, int ccol) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean isCursor = (i == crow && j == ccol);
                String cell;
                if (board[i][j] == CellState.X) {
                    cell = ConsoleColor.BLUE.getAnsiCode() + board[i][j] + ConsoleColor.RESET.getAnsiCode();
                } else if (board[i][j] == CellState.O) {
                    cell = ConsoleColor.RED.getAnsiCode() + board[i][j] + ConsoleColor.RESET.getAnsiCode();
                } else {
                    cell = board[i][j].toString();
                }
                if (isCursor) {
                    System.out.print(ConsoleColor.MAGENTA.getAnsiCode() + "{" + ConsoleColor.RESET.getAnsiCode() + cell + ConsoleColor.MAGENTA.getAnsiCode() + "}" + ConsoleColor.RESET.getAnsiCode());
                } else {
                    System.out.print(" " + cell + " ");
                }
            }
            System.out.println();
        }
    }

    static void show(CellState[][] board) {
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

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
