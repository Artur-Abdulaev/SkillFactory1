package skillFactoryTasks.firstPracticeWeek.mediumTasks.Task8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Separator s1 = new Separator(1,2,3,4,5,6,7,8,9,10);


        System.out.println(Arrays.toString(s1.even()));
        System.out.println(Arrays.toString(s1.odd()));
    }
}
