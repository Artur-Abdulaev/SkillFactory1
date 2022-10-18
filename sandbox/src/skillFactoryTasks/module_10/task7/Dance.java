package skillFactoryTasks.module_10.task7;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Dance {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("out/module10_task7/dance.txt")));


        StringBuilder rhythm = new StringBuilder();
        int steps = Integer.parseInt(scanner.nextLine());
        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            rhythm.append(str).append("\n");
        }

        String[] strings = rhythm.toString().trim().split("\n");

        StringBuilder result = new StringBuilder();
        for (String string : strings) {
            result.append(Integer.parseInt(string) / steps).append(" ").append(Integer.parseInt(string) % steps).append("\n");
        }

        FileWriter writer = new FileWriter("out/module10_task7/rhythm.txt", false);
        writer.write(result.toString().trim());
        writer.flush();
    }
}
