package projectchess;

public abstract class ChessPiece {
    String color;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public abstract String getColor();
    public abstract boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn);
    public abstract String getSymbol();

    // он есть в ChessBoard 52
    protected boolean checkPos(int pos) { return pos >= 0 && pos <= 7; }
    protected int getMax(int a, int b) { return Math.max(a, b); }
    protected int getMin(int a, int b) { return Math.min(a, b); }
}
