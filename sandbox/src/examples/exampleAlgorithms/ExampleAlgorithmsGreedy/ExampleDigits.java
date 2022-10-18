package examples.exampleAlgorithms.ExampleAlgorithmsGreedy;

import java.util.Arrays;

public class ExampleDigits {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5};

        System.out.println(maxNumberFromDigits(digits));

 }

    public static String maxNumberFromDigits(int[] digits){
        //{3, 1, 7, 9, 9, 5}; - > {1, 3, 7, 5, 9, 9}
        //сложность алгоритма
        // O(n*log(n))
        // O(n)
        // O(n*log(n))

        Arrays.sort(digits);

        String result = "";
        for (int i = digits.length - 1; i>=0; i--)
            result += digits[i];

        return result;
        }

}