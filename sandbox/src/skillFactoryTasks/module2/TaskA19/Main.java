package skillFactoryTasks.module2.TaskA19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        table(sc.nextInt());
    }

    public static void table(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                System.out.print(k * i + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " * " + 5 + " = " + i * 5);
        }
    }
}




