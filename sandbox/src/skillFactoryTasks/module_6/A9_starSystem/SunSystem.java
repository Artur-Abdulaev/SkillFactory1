package skillFactoryTasks.module_6.A9_starSystem;

public class SunSystem extends StarSystem {

    private long population;


    public SunSystem(int quantityOfPlanets, int age, long population) {
        super("sun",quantityOfPlanets, age);
        this.population = population;
    }

    public String getInfo() {
        return "This is the most densely populated star system in the universe(probably).";
    }


}
