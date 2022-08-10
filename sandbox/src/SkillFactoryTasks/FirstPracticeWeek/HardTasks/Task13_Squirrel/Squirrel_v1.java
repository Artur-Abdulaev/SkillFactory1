package SkillFactoryTasks.FirstPracticeWeek.HardTasks.Task13_Squirrel;

public class Squirrel_v1 {

    public static void main(String[] args) {
//        Squirrel_v1 s = new Squirrel_v1(new int[] {2, 5, -3, -1});
//        System.out.println(s.maxNuts());           4  5   4   1  6  9
        Squirrel_v1 s2 = new Squirrel_v1(new int[]{1, -2, 3, 1, -1, -4, 2, 3});
        s2.maxNuts();
    }

    int[] nuts; // поле nuts

    public Squirrel_v1(int[] nuts) {
        this.nuts = nuts; // инициализируем nuts
    }

    int getNuts(int n) {
        return nuts[n];
    } // возвращаем значение элемента n

    int maxNuts() {
        if (nuts.length > 1) {
            int arr[] = nuts.clone();
            arr[1] = max(arr[1], arr[0] + arr[1]); //2 7
            if (arr[1] < 0) arr[1] = 0;

            for (int i = 2; i < arr.length; i++) {
                arr[i] = max(arr[i] + arr[i - 1], arr[i] + arr[i - 2]);
                if (arr[i] < 0) arr[i] = 0;
            }

            int a = max(arr[arr.length - 2], arr[arr.length - 1]);
            return max(0, a);
        } else return max(0, nuts[0]);
    }

    private int max(int a, int b) { // метод нахождения максимума
        if (a >= b) return a;
        return b;
    }
}
