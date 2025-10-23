package hw.tictactoe;

import java.io.IOException;

import static hw.tictactoe.Bot.clearInput;
import static hw.tictactoe.Bot.getBotMove;
import static hw.tictactoe.TicTacToeFuncs.*;

public class TicTacToe {
    static boolean isAgainstBot = false;
    static BotDifficulty botDifficulty = BotDifficulty.NONE;

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(ConsoleColor.BCYAN.getAnsiCode() + "Welcome to TicTacToe!" + ConsoleColor.RESET.getAnsiCode());
        System.out.println("Choose game mode: ");
        System.out.println("1 for Player vs Player");
        System.out.println("2 for Player vs Bot");
        System.out.println("Your choose: ");
        char mode = (char) System.in.read();
        clearInput();
        if (mode == '2') {
            isAgainstBot = true;
            System.out.println(ConsoleColor.BCYAN.getAnsiCode() + "Choose game mode: " + ConsoleColor.RESET.getAnsiCode());
            System.out.println("1 for New to game");
            System.out.println("2 for Hardmode");
            System.out.println("Your choose: ");
            char diff = (char) System.in.read();
            clearInput();
            switch (diff) {
                case '1':
                    botDifficulty = BotDifficulty.NONE;
                    break;
                case '2':
                    botDifficulty = BotDifficulty.HARD;
                    break;
            }
        }
        CellState[][] board = new CellState[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = CellState.__;
            }
        }
        int crow = 0;
        int ccol = 0;
        int turn = 9;
        clearConsole();
        showPlaying(board, crow, ccol);
        System.out.print("Use WASD to move, Press p to place");
        System.out.println();
        System.out.println("Current turn: " + (turn % 2 == 1 ? "X" : "O"));
        while (turn != 0) {
            clearConsole();
            showPlaying(board, crow, ccol);
            System.out.print("Use WASD to move, Press p to place");
            System.out.println();
            System.out.println("Current turn: " + (turn % 2 == 1 ? "X" : "O"));

            if (isAgainstBot && turn % 2 == 0) {
                Thread.sleep(500);
                int[] move = getBotMove(board, botDifficulty);
                if (move != null) {
                    board[move[0]][move[1]] = CellState.O;
                    crow = move[0];
                    ccol = move[1];
                    turn--;

                    Player winner = hasWinner(board);
                    if (winner == Player.O) {
                        clearConsole();
                        showRes(board);
                        System.out.println(ConsoleColor.RED.getAnsiCode() + "The winner is: O!!!" + ConsoleColor.RESET.getAnsiCode());
                        return;
                    }
                    if (isDraw(board)) {
                        clearConsole();
                        showRes(board);
                        System.out.println(ConsoleColor.MAGENTA.getAnsiCode() + "Draw!!!" + ConsoleColor.RESET.getAnsiCode());
                        return;
                    }
                }
                continue;
            }
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
                            clearConsole();
                            showRes(board);
                            System.out.println("\u001B[33m The winner is: X!!\u001B[0m");
                            return;
                        } else if (winner == Player.O) {
                            clearConsole();
                            showRes(board);
                            System.out.println("\u001B[33m The winner is: O!!\u001B[0m");
                            return;
                        }
                        if (isDraw(board)) {
                            clearConsole();
                            showRes(board);
                            System.out.println(ConsoleColor.MAGENTA.getAnsiCode() + "Draw!!" + ConsoleColor.RESET.getAnsiCode());
                            return;
                        }
                        break;
                    }
            }
        }
    }
}
