package skillFactoryTasks.module_6.a10_Bird;

public class Pigeon extends Bird {

    int hunger;

    public Pigeon(String[] continents, long population, int hunger) {
        super("pigeon", continents, population);
        this.hunger = hunger;

    }

    public void askForSeeds() {
        if (hunger >= 7) {
            hunger = hunger - 7;
        } else if (hunger > 0) {
            hunger = 0;
        }
    }

    public void sleep() {
        hunger += 3;
    }

    public int getHunger() {
        return hunger;
    }
}



