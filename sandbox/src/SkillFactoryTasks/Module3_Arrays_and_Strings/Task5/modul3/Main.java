package SkillFactoryTasks.Module3_Arrays_and_Strings.Task5.modul3;

public class Main {
    public static void main(String[] args) {
        double[] array = {1.3, 3.2, 5.1, 4.7};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);

        double max = Double.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println(max);
    }
}

