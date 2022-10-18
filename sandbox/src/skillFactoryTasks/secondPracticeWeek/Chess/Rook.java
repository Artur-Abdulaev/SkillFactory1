package skillFactoryTasks.secondPracticeWeek.Chess;

public class Rook extends ChessPiece {

    public Rook(String color) {
        super(color);
    }

    @Override
    String getColor() {
        return this.color;
    }

    @Override
    boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        if (!checkPos(line) || !checkPos(column)) return false;
        if (!checkPos(toLine) || !checkPos(toColumn)) return false;

        if (Math.abs(line - toLine) == 0 && Math.abs(column - toColumn) > 0) {
            check = false;
            return true;
        }
        if (Math.abs(line - toLine) > 0 && Math.abs(column - toColumn) == 0) {
            check = false;
            return true;
        }
        return false;
    }

    // 5,2 -> 5,1 -> 7,0 ->
    @Override
    String getSymbol() {
        return "R";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
