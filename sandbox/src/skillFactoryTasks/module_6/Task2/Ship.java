package skillFactoryTasks.module_6.Task2;

public class Ship {

    protected String name;
    protected int yearOfManufacture;
    Ship(String name, int yearOfManufacture) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
    }
    public String toString() {
        String output = String.format("����� \"%s\" ��������� � %d ����.",
                name, yearOfManufacture);
        return output;
    }
}
