package SkillFactoryTasks.Module3_Arrays_and_Strings.Task6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            if (count(name) > 1) {
                System.out.println("incorrect word!");
            } else {
                reverseName(name);
            }
        }
    }

    public static void reverseName(String str) {
        char[] nameArr = str.toCharArray();
        int n = nameArr.length;
        char[] reversNameArr = new char[n];
        for (int i = 0; i < n; i++) {
            reversNameArr[n - i - 1] = str.charAt(i);
        }
        for (int i = 0; i < reversNameArr.length; i++) {
            System.out.print(reversNameArr[i]);
        }
    }

    public static int count(String sentence) {

        String[] words = sentence.split("\\s+");
        return words.length;
    }

}
