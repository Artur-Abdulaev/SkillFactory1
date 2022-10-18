package skillFactoryTasks.module_6.Task2;

public class Main {

    public static void main(String[] args) {
        Ship ship = new Ship("SomeShip", 1999);
        Ship cruiseShip = new CruiseShip("Titanic", 1907, 21);
        Ship cargoShip = new CargoShip("Nafta", 2000, 3000);

        System.out.println(ship);
        System.out.println(cruiseShip);
        System.out.println(cargoShip);
    }
}
