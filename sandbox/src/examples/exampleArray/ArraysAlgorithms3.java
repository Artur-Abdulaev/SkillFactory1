package examples.exampleArray;

public class ArraysAlgorithms3 {
    public static void main(String[] args) {
        int[] myArray = {7, 1, 7, 8, 1, 6, 6, 8, 6};
        for (int i = 0; i < myArray.length; i++) {

            boolean flag = true;

            for (int j = 0; j < myArray.length; j++) {
                if(myArray[i] == myArray[j] && i != j){
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println(myArray[i] + " ");
        }
    }
}
