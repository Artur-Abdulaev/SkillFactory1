package skillFactoryTasks.module_10.task4;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("C:/Users/À/Desktop/study/Programming/IntelliJ IDEA Educational Edition 2022.1/Projects/sandbox/out/production/numbers.txt"));
        int index = 1;
        String resString = "";

        while (scanner.hasNextLine()) {
            String nowNumber = scanner.nextLine();
            if (Integer.parseInt(nowNumber) == index) {
                resString += nowNumber + " ";
            }
            index++;
        }

        if (resString.equals("")) {
            resString = "0";
        }

        FileWriter writer = new FileWriter("C:/Users/À/Desktop/study/Programming/IntelliJ IDEA Educational Edition 2022.1/Projects/sandbox/out/production/output.txt", false);
        writer.write(resString.trim());
        writer.flush();
    }
}
