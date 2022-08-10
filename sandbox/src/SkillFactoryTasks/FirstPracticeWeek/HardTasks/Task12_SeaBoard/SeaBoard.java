package SkillFactoryTasks.FirstPracticeWeek.HardTasks.Task12_SeaBoard;

public class SeaBoard {
    public static void main(String[] args) {
        SeaBoard board = new SeaBoard();


        String m = "m";
        String h = "h";
        String d = "d";

        board.shoot(0, 0, m);
        board.shoot(2, 0, h);
        board.shoot(6, 9, h);
        board.shoot(2, 1, d);

        System.out.println(board.check(1, 1));


    }


    public SeaBoard() {
        newGame();
    }

    private String[][] field = new String[10][10];

    void newGame() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                field[i][j] = ".";
            }
        }
    }

    String[][] getField() {
        String[][] result = new String[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j].equals("X")) result[i][j] = "x";
                else result[i][j] = field[i][j];
            }
        }
        return result;
    }

    void printField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(field[i][j]);
            }
            System.out.print(System.lineSeparator());
        }
    }

    String check(int line, int column) {
        if (field[line][column].equals("X")) return "x";
        return field[line][column];
    }

    void shoot(int line, int column, String issue) {
        if (issue.equals("m")) field[line][column] = "#";
        else if (issue.equals("h")) field[line][column] = "X";
        else {
            field[line][column] = "X";
            destroyShip(line, column);
        }
    }

    void destroyShip(int line, int column) {
        int[][] commands = new int[][]
                {
                        {line - 1, column}, {line + 1, column},
                        {line, column - 1}, {line, column + 1},
                        {line - 1, column - 1}, {line - 1, column + 1},
                        {line + 1, column - 1}, {line + 1, column + 1}
                };


        for (int[] i : commands) {
            if (0 <= i[0] && i[0] <= 9 && 0 <= i[1] && i[1] <= 9 && field[i[0]][i[1]].equals(".")) {
                field[i[0]][i[1]] = "#";
            }

        }

        field[line][column] = "x";

        for (int[] i : commands) {
            if (0 <= i[0] && i[0] <= 9 && 0 <= i[1] && i[1] <= 9 && field[i[0]][i[1]].equals("X")) {
                destroyShip(i[0], i[1]);
            }
        }
    }
}
