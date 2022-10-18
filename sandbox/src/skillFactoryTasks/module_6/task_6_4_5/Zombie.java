package skillFactoryTasks.module_6.task_6_4_5;

public class Zombie extends Monster {

    public static String scream = "Raaaauuughhhh";
    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }

    public void growl(){
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean loud){
        if (!loud) {
            growl();
        }
        else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }

    @Override
    public void attack(){
        super.attack();
        growl();
    }

}


