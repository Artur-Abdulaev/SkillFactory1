public class Task1 {

    public static void main(String[] args) {
        v("abc", 1.0, 2.0);
        v("def", 1.0, 2.0, 3.0, 4.0);
        v("ghi", 1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
    }

    /**
     * @param s       �����
     * @param doubles ������� ��������
     */
    private static void v(String s, Double... doubles) {            // [1]
        System.out.printf("text: %s\n", s);

        for (Double d : doubles) {                                  // [2]
            System.out.println(d);
        }
    }

}