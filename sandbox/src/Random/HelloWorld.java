package Random;

public class HelloWorld {

    public static void main(String[] args) {

        long startTime1 = System.currentTimeMillis();
        System.out.println("����� ������� ���������:" + startTime1 + " ms");
        StringBuilder s1 = new StringBuilder("1");
        for (int i = 2; i < 1200000; i++) {
            s1.append(String.valueOf(3));
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("����� ��������� ���������:" + endTime1 + " ms");
        System.out.println("����� ���������� String �����:" + (endTime1 - startTime1) + "ms");


        long startTime2 = System.currentTimeMillis();
        System.out.println("����� ������� ���������:" + startTime2 + " ms");
        for (int i = 2; i < 50000; i++) {
            s1.reverse();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("����� ��������� ���������:" + endTime2 + " ms");
        System.out.println("����� ���������� String �����:" + (endTime2 - startTime2) + "ms");
    }
}