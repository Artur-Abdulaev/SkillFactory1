package Test;

public class SecondClass extends FirstClass {
    SecondClass(int a, int b, int c) {
        super(a);
        this.b = b;
        this.c = c;
    }
    @Override
    public int plus(int d) {
        return super.plus(d) + a;
    }
    public static void main(String args[]) {

//        String[] tokens = command.split("\\s+", 2);
    }
}
