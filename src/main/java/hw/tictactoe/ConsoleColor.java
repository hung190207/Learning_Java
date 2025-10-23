package hw.tictactoe;

public enum ConsoleColor {
    RED("\u001B[31m"),
    BYELLOW("\u001B[103m"),
    BLUE("\u001B[34m"),
    MAGENTA("\u001B[35m"),
    CYAN("\u001B[36m"),
    BCYAN("\u001B[46m"),
    RESET("\u001B[0m");
    private final String ansiCode;

    ConsoleColor(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    public String getAnsiCode() {
        return ansiCode;
    }
}
