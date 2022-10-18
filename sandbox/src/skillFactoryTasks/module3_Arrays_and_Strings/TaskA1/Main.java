package skillFactoryTasks.module3_Arrays_and_Strings.TaskA1;

import java.util.Arrays;

public class Main {
    public static int[] numbers = new int[100];

    public static void main(String[] args) {
        int[] oddNumbers = new int[100];
        int num1 = 1;
        for (int i = 0; i < oddNumbers.length; i++) {

            oddNumbers[i] = num1;
            num1 += 2;
        }
//        System.out.println(Arrays.toString(oddNumbers));
        int[] negativeNumbers = new int[100];
        int num2 = -2;
        for (int i = 0; i < negativeNumbers.length; i++) {

            negativeNumbers[i] = num2;
            num2 -= 2;
        }
//        System.out.println(Arrays.toString(negativeNumbers));
        int j = 0;
        int k = 0;
        for (int i = 0; i < numbers.length; i++, j++, k++) {
            if (i % 2 == 0) {

                numbers[i] = oddNumbers[j];
            } else {
                numbers[i] = negativeNumbers[k];
            }

        }
        System.out.println(Arrays.toString(numbers));
    }
}
