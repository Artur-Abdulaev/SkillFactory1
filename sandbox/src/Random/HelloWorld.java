package Random;

public class HelloWorld {

    public static void main(String[] args) {

        long startTime1 = System.currentTimeMillis();
        System.out.println("Время запуска программы:" + startTime1 + " ms");
        StringBuilder s1 = new StringBuilder("1");
        for (int i = 2; i < 1200000; i++) {
            s1.append(String.valueOf(3));
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("Время окончания программы:" + endTime1 + " ms");
        System.out.println("Время выполнения String равно:" + (endTime1 - startTime1) + "ms");


        long startTime2 = System.currentTimeMillis();
        System.out.println("Время запуска программы:" + startTime2 + " ms");
        for (int i = 2; i < 50000; i++) {
            s1.reverse();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Время окончания программы:" + endTime2 + " ms");
        System.out.println("Время выполнения String равно:" + (endTime2 - startTime2) + "ms");
    }
}