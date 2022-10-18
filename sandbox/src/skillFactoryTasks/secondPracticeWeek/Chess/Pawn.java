package skillFactoryTasks.secondPracticeWeek.Chess;

public class Pawn extends ChessPiece {

    public Pawn(String color) {
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

        if (Math.abs(column - toColumn) > 1 || Math.abs(line - toLine) > 2) return false;

        if (((Math.abs(line - toLine) == 2) && (line == 1 || line == 6) && Math.abs(column - toColumn) == 0) && chessBoard.board[toLine][toColumn] == null) return true;

        if (Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 0 && chessBoard.board[toLine][toColumn] == null) return true;

        return (Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 1 && !chessBoard.board[toLine][toColumn].getColor().equals(this.color));

    }

    @Override
    String getSymbol() {
        return "P";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }


}
