package skillFactoryTasks.module2.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("������� ������ �������:");
            int operand1 = scanner.nextInt();
            System.out.println("������� �������� ������� ����� ��������� ����: +, -, *, / :");
            char operation = scanner.next().charAt(0);
            System.out.println("������� ������ �������:");
            int operand2 = scanner.nextInt();
            switch (operation) {
                case '+':
                    System.out.println("��� ���������: " + addition(operand1, operand2));
                    break;
                case '-':
                    System.out.println("��� ���������: " + subtraction(operand1, operand2));
                    break;
                case '*':
                    System.out.println("��� ���������: " + multiplication(operand1, operand2));
                    break;
                case '/':
                    System.out.println("��� ���������: " + division(operand1, operand2));
                    break;
                default:
                    System.out.println("������� ������������ ��������");
            }
        }
    }

    public static int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int division(int a, int b) {
        int result;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("�� ���� ������ ������!");
            return -1;
        }
        return result;
    }
}

