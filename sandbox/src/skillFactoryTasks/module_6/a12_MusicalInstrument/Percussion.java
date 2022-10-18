package skillFactoryTasks.module_6.a12_MusicalInstrument;

public class Percussion extends MusicalInstrument {

    int year;

    public Percussion(String name, String manufacturer, int price, int year) {
        super(name, manufacturer, price);
        this.year = year;
    }

    String play() {
        return "Bump";
    }
}
