package skillFactoryTasks.secondPracticeWeek.task4;

public class Car {

    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    class Engine {
        boolean isWorking;
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }



        String startStopEngine() {
            if (isWorking) {
                isWorking = false;
                return "engine was stopped";
            }
            isWorking = true;
            return "engine was started";

        }
    }
}
