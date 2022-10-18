package skillFactoryTasks.module_10.task5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("C:/Users/À/Desktop/study/Programming/IntelliJ IDEA Educational Edition 2022.1/Projects/sandbox/out/production/text.txt"));

        while (scanner.hasNextLine()) {
            String string = scanner.nextLine(); // read new string
            string = string.toLowerCase().replace(" ", "");
            System.out.println(new StringBuilder(string.toLowerCase()).reverse().toString());
            if (!string.equals(new StringBuilder(string.toLowerCase()).reverse().toString())) System.out.println("false");
            if (string.equals(new StringBuilder(string.toLowerCase()).reverse().toString())) System.out.println("true");
        }
    }
}


