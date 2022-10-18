package skillFactoryTasks.module_6.Task2;

public class CruiseShip extends Ship {

    private int numberOfPassengers;
    public CruiseShip(String name, int yearOfManufacture, int
            numberOfPassengers) {
        super(name, yearOfManufacture);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
//Код для определения нужного окончания слова при согласовании с

        int lastDigit;
        if (numberOfPassengers < 10)
            lastDigit = numberOfPassengers;
        else
            lastDigit = numberOfPassengers % 10;
        String ending;

        if(lastDigit>=1 && lastDigit<=4){
            ending = "а";
        }else {
            ending = "ов";
        }

        String output;
        output = super.toString().replace(".", " ");
        output += String.format("и способно принять на борт %d пассажир%s.", numberOfPassengers, ending);

        return output;
    }
}
