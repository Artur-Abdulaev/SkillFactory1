package SkillFactoryTasks.Module3_Arrays_and_Strings.Task9;

public class Main {
    public static void main(String[] args) {
        int[] arr = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};
        int flag;
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > arr[i - 1]) {
                    flag = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = flag;
                    isSorted = false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}