package regex.Split;

import java.util.Arrays;

public class AlfaTest {
    public static void main(String[] args) {
        String a = "Hello";
        String[] words = a.split("\\s+", 2);
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);
    }
}
