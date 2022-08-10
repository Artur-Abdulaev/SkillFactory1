package ExampleArray;

public class ArrayMatrixPrintln {

    public static void main(String[] args) {
        int[][] matrix = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 0},
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int a = 0; a < matrix.length; a++) {
                System.out.println(matrix[i][a]);
            }
        }
    }
}


