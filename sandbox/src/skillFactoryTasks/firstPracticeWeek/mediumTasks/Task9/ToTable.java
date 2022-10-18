package skillFactoryTasks.firstPracticeWeek.mediumTasks.Task9;

public class ToTable {
    private int data[];
    int x, y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    int[][] resize() {


        int resize[][] = new int[x][y];
        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                resize[i][j] = data[k++];
            }
        }
        return resize;
    }

}


