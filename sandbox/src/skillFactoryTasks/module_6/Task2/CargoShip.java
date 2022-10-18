package skillFactoryTasks.module_6.Task2;

public class CargoShip extends Ship{

    private int tonnage;
    public CargoShip (String name, int yearOfManufacture, int tonnage) {
        super(name, yearOfManufacture);
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
//��� ��� ����������� ������� ��������� ����� ��� ������������ �
        int lastDigit;
        if (tonnage < 10)
            lastDigit = tonnage;
        else
            lastDigit = tonnage % 10;
        String ending;
        if(lastDigit == 1){
            ending = "�";
        }else if(lastDigit>1 && lastDigit<=4){
            ending = "�";
        }else{
            ending = "";
        }
        String output;
        output = super.toString().replace(".", " ");
        output += String.format("� �������� ��������� %d ����%s �����.",

                tonnage, ending);

        return output;
    }
}

