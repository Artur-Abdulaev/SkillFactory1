package skillFactoryTasks.firstPracticeWeek.mediumTasks.Task9;

import java.util.Arrays;

public class ToLine {
    private int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    int[] resize() {
        int[] res = new int[data.length * data[0].length];
        int start = 0;
        for (int[] datum : data) {
            System.out.println(Arrays.toString(datum));
            for (int j = 0; j < datum.length; j++) {
                res[start + j] = datum[j];
            }
            start += datum.length;
        }
        return res;


//        int num = 0;
//
//        int[] arr = new int[data.length * data[0].length];
//
//        for (int i = 0; i < data.length; i++) {
//            for (int j = 0; j < data[0].length; j++) {
//                arr[num++] = data[i][j];
//            }
//        }
//        return arr;
    }
}
