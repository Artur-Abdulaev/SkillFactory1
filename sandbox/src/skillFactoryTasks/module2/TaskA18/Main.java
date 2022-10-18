package skillFactoryTasks.module2.TaskA18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        syracuseSequence(sc.nextInt());
    }


    static public void syracuseSequence(int number) {
        int count = 0;
        while (number != 1) {
            if (number % 2 == 0) {
                number = number / 2;
                System.out.print(number + " ");
            } else {
                number = 3 * number + 1;
                System.out.print(number + " ");
            }
            count++;
        }
        System.out.println("\n" + count);

    }
}




