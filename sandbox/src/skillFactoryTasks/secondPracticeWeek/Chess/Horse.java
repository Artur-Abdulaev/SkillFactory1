package skillFactoryTasks.secondPracticeWeek.Chess;

public class Horse extends ChessPiece {

    public Horse(String color) {
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

        if (Math.abs(line - toLine) == 2 && Math.abs(column - toColumn) == 1 || (Math.abs(line - toLine) == 1 && Math.abs(column - toColumn) == 2) &&
                (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].getColor().equals(this.color)) )
            return true;

        return false;
        }


    // 0,0 -> 1,2
    @Override
    String getSymbol() {
        return "H";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
