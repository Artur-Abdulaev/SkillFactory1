package examples.exampleArray;

public class ArraysAlgorithms1 {
    public static void main(String[] args) {
        int[] myArray = {7, 1, 7, 8, 1, 67, 6, 5, 6};
        int[] counts = new int[max(myArray) + 1];//max=67, counts[67+1]

        for (int i = 0; i < myArray.length; i++) {
            counts[myArray[i]]++;
       }
        for (int i = 0; i < myArray.length; i++) {
            if(counts[myArray[i]] == 1) System.out.print(myArray[i] + " ");
        }
    }
    public static int max(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) max = array[i];
        }
        return max;
    }
}