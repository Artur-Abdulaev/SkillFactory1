package SkillFactoryTasks.Module2.TaskA20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ������ ��������������");
        int width = sc.nextInt();
        System.out.println("������� ����� ��������������");
        int length = sc.nextInt();
        sc.nextLine();
        System.out.println("������� ������, ������� ����� ��������� �������������");
        String symbol = sc.nextLine();

        drawRectangle(width, length, symbol);
    }

    public static void drawRectangle(int width, int length, String symbol) {
        for (int i = 0; i < width; i++) {
            String string = "";
            if (i == 0 || i == width - 1) { // ���� ������ ��� ��������� �������
                for (int j = 0; j < length; j++) {
                    string += symbol; // ������ ������ �� m ��������
                }
            } else {
                // ����� ������ ������ ���� {������ s + m - 2 ������� + ������ s}
                string += symbol;
                for (int j = 1; j < length - 1; j++) {
                    string += " ";
                }
                if (length != 1) string += symbol; // ���������, ��� ������������� �� 1 � ������
            }
            System.out.println(string);
        }
    }
}
