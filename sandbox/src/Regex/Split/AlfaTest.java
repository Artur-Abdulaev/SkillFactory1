package Regex.Split;

import java.util.Arrays;

public class AlfaTest {
    public static void main(String[] args) {
        String a = "Hello3123123there123123123hey";
        String[] words = a.split("\\d+");
        System.out.println(Arrays.toString(words));
    }
}
