package skillFactoryTasks.firstPracticeWeek.mediumTasks.Task9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ToTable t1 = new ToTable(new int[] {1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 13}, 4, 3);
        int[][] arr = t1.resize();


        System.out.println(Arrays.deepToString(arr));

        ToLine t2 = new ToLine(arr);

       int[] arr1 = t2.resize();

        System.out.println(Arrays.toString(arr1));

    }
}
