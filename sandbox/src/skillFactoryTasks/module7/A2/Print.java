package skillFactoryTasks.module7.A2;

public class Print {

    int[] arr;
    int num;
    String txt;



    public void print(int number) {
        System.out.println(number);
    }

    public void print(String text) {
        System.out.println(text);
    }

    public void print(int[] array) {
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public void print (String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
