package Regex;

public class Test {
    public static void main(String[] args) {

        /*
            \\d � ���� �����
            \\w � ���� �����
            \\w � [a-zA-Z]

            + � 1 � �����
            * � 0 � �����
            ? � 0 ��� 1 �������� ��
            (x|y|z) � ���� ������ �� ��������� �����

            [abcadefq] = (a|b|c|d|e|f|q)
            [a-zA-Z] - ��� ���������� �����
            [0-9] - \\d
            [^abc] � �� ����� ��� ������� ����� [abc]

            . � ����� ������

            {2} � 2 ������� �� (\\d{2})
            {2,} � 2 ��� ����� ������� (\\d{2,})
            {2, 4} � �� 2 �� 4 �������� (\\d{2,4})
         */

        String a = "-41241";
        String b = "41241";
        String c = "+41241";
        System.out.println(a.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(c.matches("(-|\\+)?\\d*"));

        String d = "gsdfdsf1354251";
        System.out.println(d.matches("[a-zA-Z]+\\d+"));

//        String e = "hello";
//        System.out.println(e.matches("[^abc]*"));
//
//        String url = "http://www.google.com";
//        String url2 = "http://www.yandex.ru";
//        String url3 = "Hello there";
//        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
//        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
//        System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));
//
//        String f = "1";
//        System.out.println(f.matches("\\d{2,} "));

        String j = "fasdsa";
        System.out.println(j.matches("\\w"));


    }
}
