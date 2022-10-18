package skillFactoryTasks.firstPracticeWeek.mediumTasks.Task7;

public class Main {
    public static void main(String[] args) {

        int[][] arrayPoints = {{-1, -2}, {3, 4}, {-3, 6}};
        LimitingRectangle r1 = new LimitingRectangle(arrayPoints);
        System.out.println(r1.getBorders());



    }
}
