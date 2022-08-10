package SkillFactoryTasks.Module3_Arrays_and_Strings.TaskA2_Fibonacci;

import java.util.Arrays;

public class FibonacciNumbers {
    public static int[] numbers = new int[30];

    public static void main(String[] args) {

        numbers[0] = numbers[1] = 1;

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        System.out.println(Arrays.toString(numbers));
    }


}
