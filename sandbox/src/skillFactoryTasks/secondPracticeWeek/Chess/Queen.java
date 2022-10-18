package skillFactoryTasks.secondPracticeWeek.Chess;

public class Queen extends ChessPiece {

    public Queen(String color) {
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



        if (Math.abs(line - toLine) == 0 && Math.abs(column - toColumn) > 0) return true;
        if(Math.abs(line - toLine) > 0 && Math.abs(column - toColumn) == 0) return true;

        return Math.abs(line - toLine) == Math.abs(column - toColumn) && Math.abs(column - toColumn) != 0;
    }

    @Override
    String getSymbol() {
        return "Q";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
