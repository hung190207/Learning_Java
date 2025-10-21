package hw.tictactoe;

public enum ConsoleColor {
    RED("\u001B[31m"),
    BLUE("\u001B[34m"),
    RESET("\u001B[0m");
    private final String ansiCode;

    ConsoleColor(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    public String getAnsiCode() {
        return ansiCode;
    }
}
