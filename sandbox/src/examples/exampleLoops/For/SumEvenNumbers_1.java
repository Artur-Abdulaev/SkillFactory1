package examples.exampleLoops.For;

public class SumEvenNumbers_1 {
    public static void main(String[] args) {
        int number = 20;
        var result = 0;
        for (int i = 0; i <= number; i += 2) {
            result = result + i;
        }
        System.out.println(result);
    }
}

