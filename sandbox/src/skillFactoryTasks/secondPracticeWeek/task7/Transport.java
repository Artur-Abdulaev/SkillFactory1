package skillFactoryTasks.secondPracticeWeek.task7;

abstract class Transport {

    int fuel, speed;

    public Transport(int fuel, int speed) {
        this.fuel = fuel;
        this.speed = speed;
    }

    abstract boolean canMove(int n);

    abstract int getFuelLevel();

}
