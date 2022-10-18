package skillFactoryTasks.module_6.Task1;

public class Knight extends Soldier {


    public Knight(String name) {
        super(name);
        this.price = 245;
        this.phrase = "Наше дело правое, а врага - найдем";
    }

    void feed() {
        System.out.println("Кормит лошадь");
    }
}
