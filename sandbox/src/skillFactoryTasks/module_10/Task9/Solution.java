package skillFactoryTasks.module_10.Task9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        skillFactoryTasks.module_10.task8.Solution solution = new skillFactoryTasks.module_10.task8.Solution();
        Solution solution1 = new Solution();
        solution1.solution("dfsfdsf", 22,222);
    }

    public void solution(String district, int fromYear, int toYear) throws FileNotFoundException {
        StringBuilder dataIn = new StringBuilder();
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("out/module10/task9/crop_volumes.txt")));
        int count = 0;
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            dataIn.append(str).append("\n");
            count++;
        }

        String[] strings = dataIn.toString().trim().split("[\n;]");
        String[][] table = new String[count][strings.length / count];

        int index = 0;
        for (int i = 0; i < table.length; i++) {
            for (int k = 0; k < table[0].length; k++) {
                table[i][k] = strings[index++];
            }
        }

        boolean isMatchDistrict;
        for (int i = 1; i < table.length; i++) {

        }

        StringBuilder dataOut = new StringBuilder("Part, " + fromYear + ", " + toYear);



//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i] + "  [" + i + "]");
//        }

        System.out.println(Arrays.deepToString(table));

//        String[][] table = new String[strings.length / ][strings.length / ];
    }
}
