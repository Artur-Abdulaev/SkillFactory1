package skillFactoryTasks.module_12.webinar_1;

public class Main {
    public static void main(String[] args) {
        CustomArrayList transport = new CustomArrayList();
        transport.add(new Car());
        transport.add(new Car());
        transport.add(new Car());
        transport.add(new Plane());
        for (int i = 0; i < 4; i++) {
            ((Car)transport.get(i)).drive();
        }
    }
}
class Car {
    void drive() {
        System.out.println("Driving car");
    }
}

class Plane {
    void fly() {
        System.out.println("Flying in the plain");
    }
}