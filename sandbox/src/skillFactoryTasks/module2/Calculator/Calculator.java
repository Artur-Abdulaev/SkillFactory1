package skillFactoryTasks.module2.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Введите первый операнд:");
            int operand1 = scanner.nextInt();
            System.out.println("Введите операцию которую нужно выполнить типа: +, -, *, / :");
            char operation = scanner.next().charAt(0);
            System.out.println("Введите второй операнд:");
            int operand2 = scanner.nextInt();
            switch (operation) {
                case '+':
                    System.out.println("Ваш результат: " + addition(operand1, operand2));
                    break;
                case '-':
                    System.out.println("Ваш результат: " + subtraction(operand1, operand2));
                    break;
                case '*':
                    System.out.println("Ваш результат: " + multiplication(operand1, operand2));
                    break;
                case '/':
                    System.out.println("Ваш результат: " + division(operand1, operand2));
                    break;
                default:
                    System.out.println("Введена некорректная операция");
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
            System.out.println("На ноль делить нельзя!");
            return -1;
        }
        return result;
    }
}

