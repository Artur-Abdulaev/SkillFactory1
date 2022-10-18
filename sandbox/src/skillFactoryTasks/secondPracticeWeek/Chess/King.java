package skillFactoryTasks.secondPracticeWeek.Chess;

public class King extends ChessPiece {
    public King(String color) {
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

        if (Math.abs(line - toLine) == 0 && Math.abs(column - toColumn) == 0) return false;

        if (Math.abs(line - toLine) < 2 && Math.abs(column - toColumn) < 2) {
            check =false;
            return true;
        }
        return false;

    }

    @Override
    String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (chessBoard.board[i][j] != null) {
                    if (!chessBoard.board[i][j].getColor().equals(color) && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }
}
