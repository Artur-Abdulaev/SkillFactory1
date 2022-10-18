package examples.exampleArray;

public class ArrayFirstString {
    public static void main(String[] args) {
        String s1 = "Первая строка";
        char[] charArray = new char[s1.length()];
        for (int i = 0; i < s1.length(); i++) {
            charArray[i] = s1.charAt(i);
            System.out.println(charArray[i]);
        }
    }
}


