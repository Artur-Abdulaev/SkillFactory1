package ExampleLoops.ForEach;

import java.util.Scanner;

public class ForEachSquareSides {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] sides = new int[length];
        for (int i = 0; i < length; i++) {
            sides[i] = scanner.nextInt();
        }
        for (int a : sides) {
            a = a * a;
            System.out.println(a);
        }

    }
}