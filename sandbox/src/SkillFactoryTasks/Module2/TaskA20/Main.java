package SkillFactoryTasks.Module2.TaskA20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите ширину пр€моугольника");
        int width = sc.nextInt();
        System.out.println("¬ведите длину пр€моугольника");
        int length = sc.nextInt();
        sc.nextLine();
        System.out.println("¬ведите символ, которым будет нарисован пр€моугольник");
        String symbol = sc.nextLine();

        drawRectangle(width, length, symbol);
    }

    public static void drawRectangle(int width, int length, String symbol) {
        for (int i = 0; i < width; i++) {
            String string = "";
            if (i == 0 || i == width - 1) { // если перва€ или последн€€ строчки
                for (int j = 0; j < length; j++) {
                    string += symbol; // строим строку из m символов
                }
            } else {
                // иначе строим строку вида {символ s + m - 2 пробела + символ s}
                string += symbol;
                for (int j = 1; j < length - 1; j++) {
                    string += " ";
                }
                if (length != 1) string += symbol; // провер€ем, что пр€моугольник не 1 в ширину
            }
            System.out.println(string);
        }
    }
}
