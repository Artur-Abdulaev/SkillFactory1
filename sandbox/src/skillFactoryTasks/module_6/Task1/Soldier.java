package skillFactoryTasks.module_6.Task1;

public class Soldier {

    String name;
    int price;
    String phrase;

    public Soldier(String name){
        this.name = name;
        this.price = 135;
        this.phrase = "����� ���������";
    }

    public void attack() {
        System.out.println(this.name + " �������!");
    }

    public void move() {
        System.out.println(this.name + " ������������� � ��������� �����");
    }

    public void sound(){
        System.out.println(this.name + " �������: " + phrase);
    }

}