package skillFactoryTasks.firstPracticeWeek.mediumTasks.Task8;

public class Separator {

    int array[];


    public Separator(int...array) {
        this.array = array;
    }

    int[] even() {
        int ind = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ind++;
            }
        }
        int num = 0;
        int[] evenNums = new int[ind];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenNums[num] = array[i];
                num++;
            }
        }
        return evenNums;
    }

    int[] odd() {
        int ind = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                ind++;
            }
        }
        int num = 0;
        int[] oddNums = new int[ind];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                oddNums[num] = array[i];
                num++;
            }
        }
        return oddNums;
    }

    public static String arrayToString(int[] array) {
        String result = "";
        for(int i : array) {
            result += i;
        }
        return result;
    }


    public String toString() {
        return arrayToString(this.array);
    }
}
