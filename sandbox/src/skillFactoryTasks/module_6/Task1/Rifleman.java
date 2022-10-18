package skillFactoryTasks.module_6.Task1;

public class Rifleman extends Soldier {

    public Rifleman(String name) {
        super(name);
        this.price = 205;
        this.phrase = "ћушкет и жену не дам никому";
    }

    @Override
    public void attack() {
        System.out.println(this.name + " стрел€ю из мушкета");
    }


}
