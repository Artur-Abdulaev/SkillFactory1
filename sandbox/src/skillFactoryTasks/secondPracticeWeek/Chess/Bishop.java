package skillFactoryTasks.secondPracticeWeek.Chess;

public class Bishop extends ChessPiece {

    public Bishop(String color) {
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

        if (Math.abs(line - toLine) == 0) return false;

        if (!(Math.abs(line - toLine) == Math.abs(column - toColumn))) return false;


        int count = Math.abs(line - toLine);


//        for (int i = line; i < toLine; i++) {
//            for (int j = column; j < toColumn; j++) {
//                if (chessBoard.board[i][j] != null) {
//                    if (!chessBoard.board[i][j].getColor().equals(color) && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
//                        return true;
//                    }
//                }
//            }
//        }


        return false;
    }

    @Override
    String getSymbol() {
        return "B";
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
