package skillFactoryTasks.module_6.a12_MusicalInstrument;

public class MusicalInstrument {

    String name, manufacturer;
    int price;

    public MusicalInstrument(String name, String manufacturer, int price) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public String info() {
        return name + " " + manufacturer + " " + price;
    }
}
