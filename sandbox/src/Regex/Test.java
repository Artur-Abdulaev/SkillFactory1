package Regex;

public class Test {
    public static void main(String[] args) {

        /*
            \\d Ч одна цифра
            \\w Ч одна буква
            \\w Ч [a-zA-Z]

            + Ч 1 и более
            * Ч 0 и более
            ? Ч 0 или 1 символов до
            (x|y|z) Ч одна строка из множества строк

            [abcadefq] = (a|b|c|d|e|f|q)
            [a-zA-Z] - все английские буквы
            [0-9] - \\d
            [^abc] Ч мы хотим все символы кроме [abc]

            . Ч любой символ

            {2} Ч 2 символа до (\\d{2})
            {2,} Ч 2 или более символа (\\d{2,})
            {2, 4} Ч от 2 до 4 символов (\\d{2,4})
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
