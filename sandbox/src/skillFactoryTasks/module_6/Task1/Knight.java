package skillFactoryTasks.module_6.Task1;

public class Knight extends Soldier {


    public Knight(String name) {
        super(name);
        this.price = 245;
        this.phrase = "���� ���� ������, � ����� - ������";
    }

    void feed() {
        System.out.println("������ ������");
    }
}
