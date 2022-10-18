package skillFactoryTasks.secondPracticeWeek.task7;

public class Plane extends Transport {


    public Plane(int fuel, int speed) {
        super(fuel, speed);
    }

    @Override
    boolean canMove(int n) {
        if (fuel >= n) {
            fuel -= n;
            return true;
        }
        return false;
    }

    @Override
    int getFuelLevel() {
        return this.fuel;
    }

    void fillFuel(int n) {
        fuel += n;
    }
}
