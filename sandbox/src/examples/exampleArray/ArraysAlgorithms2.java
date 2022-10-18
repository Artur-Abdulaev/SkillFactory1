package examples.exampleArray;

import java.util.Arrays;

public class ArraysAlgorithms2 {

    public static void main(String[] args) {
        int [] num1 =  {1, 0, 3, 4};
        int [] num2 = {1, 4, 3};
        System.out.println(Arrays.toString(intersectionMethod(num1,num2)));
    }

    public static int[] intersectionMethod(int[] num1, int[] num2) {
        int[] result = new int[Math.min(num1.length, num2.length)];
        for (int i = 0; i < num1.length; i++) {

            for (int j = 0; j < num2.length; j++) {
                if (num1[i] == num2[j]) {
                    result[j] = num2[j];
                }
            }
        }
        return result;
    }
}

