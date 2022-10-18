package skillFactoryTasks.module_6.a12_MusicalInstrument;

public class Stringed extends MusicalInstrument {

    int quantityOfStrings;

    public Stringed (String name, String manufacturer, int price, int quantityOfStrings) {
        super(name, manufacturer, price);
        this.quantityOfStrings = quantityOfStrings;
    }

    String play() {
        return name + "sounds beautiful";
    }
}
