package skillFactoryTasks.module_6.task_6_4_7;

public class Monster {

    String name;
    int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
        System.out.println("Monster " + this.name + " was created");
    }

    public void growl() {
        System.out.println(" " + this.name + " growled");
    }

    public void attack() {
        System.out.println("Moster " + this.name + " attacked with damage " + this.damage);

    }

}
