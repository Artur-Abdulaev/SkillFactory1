package skillFactoryTasks.module_10.task8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Solution solution = new Solution();
        solution.solution(80);
    }

    public void solution(double n) throws FileNotFoundException {
        StringBuilder tableEGE = new StringBuilder();
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("out/module10/task8/EGE.txt")));
        int count = 0;
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            tableEGE.append(str).append("\n");
            count++;
        }

        String[] strings = tableEGE.toString().trim().split("[\n;]");
        String[][] table = new String[count][strings.length / count];

        int index = 0;
        for (int i = 0; i < table.length; i++) {
            for (int k = 0; k < table[0].length; k++) {
                table[i][k] = strings[index++];
            }
        }

        for (int i = 1; i < table.length; i++) {
            if (Double.parseDouble(table[i][2]) >= n) {
                System.out.println(table[i][0]);
            }
        }
    }
}

