package SkillFactoryTasks.FirstPracticeWeek.HardTasks.Task11_TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.newGame();

        game.printField();
        System.out.println(game.makeMove(1, 1));
        game.printField();
        System.out.println(game.makeMove(1, 1));
        System.out.println(game.makeMove(1, 2));
        game.printField();
        System.out.println(game.makeMove(2, 1));
        System.out.println(game.makeMove(2, 2));
        System.out.println(game.makeMove(3, 1));
        System.out.println(game.makeMove(2, 2));
        game.printField();
        System.out.println(game.makeMove(3, 2));
    }

    String player1 = "X";
    String player2 = "0";
    int movesCount;
    boolean gameEnded;

    public TicTacToe() {
        newGame();
    }

    private String[][] field = new String[3][3];

    void newGame() {
        gameEnded = false;
        movesCount = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = "-";
            }
        }
    }

    String[][] getField() {
        return field;
    }

    void printField() {
        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + (j == 2 ? "" : ", "));
            }
            System.out.print("]" + System.lineSeparator());
        }
    }

    String checkGame() {
        if (field[0][0] == field[0][1] && field[0][1] == field[0][2] && !field[0][0].equals("-"))
            return field[0][0].equals(player1) ? player1 : player2;
        if (field[1][0] == field[1][1] && field[1][1] == field[1][2] && !field[1][0].equals("-"))
            return field[1][0].equals(player1) ? player1 : player2;
        if (field[2][0] == field[2][1] && field[2][1] == field[2][2] && !field[2][0].equals("-"))
            return field[2][0].equals(player1) ? player1 : player2;
        if (field[0][0] == field[1][0] && field[1][0] == field[2][0] && !field[0][0].equals("-"))
            return field[0][0].equals(player1) ? player1 : player2;
        if (field[0][1] == field[1][1] && field[1][1] == field[2][1] && !field[0][1].equals("-"))
            return field[0][1].equals(player1) ? player1 : player2;
        if (field[0][2] == field[1][2] && field[1][2] == field[2][2] && !field[0][2].equals("-"))
            return field[0][2].equals(player1) ? player1 : player2;
        if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && !field[0][0].equals("-"))
            return field[0][0].equals(player1) ? player1 : player2;
        if (field[2][0] == field[1][1] && field[1][1] == field[0][2] && !field[2][0].equals("-"))
            return field[2][0].equals(player1) ? player1 : player2;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j].equals("-")) return null;
            }
        }

        return "D";
    }

    String makeMove(int x, int y) {
        if (gameEnded) return "Game was ended";

        if (!field[x - 1][y - 1].equals("-"))
            return "Cell " + x + ", " + y + " is already occupied";

        String activePlayer = movesCount % 2 == 1 ? player1 : player2;
        movesCount++;
        field[x - 1][y - 1] = activePlayer;

        String gameStatus = checkGame();

        gameEnded = gameStatus != null;

        if (!gameEnded) return "Move completed";
        if (gameStatus.equals("D")) return "Draw";

        return "Player " + activePlayer + " won";
    }
}



