package examples.exampleLoops.For;

public class Factorial {
    public static void main(String[] args) {
        int n = 10;
        var result = 1L;
        for (int b = 1; b <= n; b++ ) {result = result*b;  }
        System.out.println(result);


    }
}