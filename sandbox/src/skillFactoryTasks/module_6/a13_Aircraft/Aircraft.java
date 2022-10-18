package skillFactoryTasks.module_6.a13_Aircraft;

public class Aircraft {

    int number, speed;

    public Aircraft(int number, int speed) {
        this.number = number;
        this.speed = speed;
    }

    double flight(int n) {
        return  Double.parseDouble(String.valueOf(n / speed));
    }
}
