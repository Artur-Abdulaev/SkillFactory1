package SkillFactoryTasks.Module2.TaskA17;

public class Main {

    public static void main(String[] args) {
        numberToWorld(111);

    }
    public static void numberToWorld(int number) {
        int length = String.valueOf(number).length();
        if (number % 2 == 1 && length == 1) {
            System.out.println("odd single digit number");
        } else if (number % 2 == 0 && length == 1) {
            System.out.println("even single digit number");
        } else if (number % 2 == 0 && length == 2) {
            System.out.println("even two-digit number");
        } else if (number % 2 == 1 && length == 2) {
            System.out.println("odd two-digit number");
        } else if (number % 2 == 0 && length == 3) {
            System.out.println("even three-digit number");
        } else if (number % 2 == 1 && length == 3) {
            System.out.println("odd three-digit number");
        }
    }
}
