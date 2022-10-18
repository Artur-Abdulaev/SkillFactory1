package examples.exampleArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEvenNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> evennums = new ArrayList<Integer>();
        while (evennums.size() < 3) {
            int num = scanner.nextInt();
            evennums.add(num);
        }
        int r = 0;
        int l = 0;
        for (int a : evennums) {
            if (a % 2 == 0) {
                r += a;
                l++;
            }
        }
        if (l > 0) {
            System.out.println(r / l);

        }
    }
}

