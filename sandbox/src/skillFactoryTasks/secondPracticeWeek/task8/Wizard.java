package skillFactoryTasks.secondPracticeWeek.task8;

public class Wizard extends Player{

    int manaLevel;
    String element;

    public Wizard(int hp, int level, String type, String weapon, int manaLevel, String element) {
        super(hp, level, type, weapon);
        this.manaLevel = manaLevel;
        this.element = element;
    }

    @Override
    String getFullInfo() {
        return String.format("%d %d %s %s %d %s", hp, level, type, weapon, manaLevel, element);
    }

    @Override
    void levelUp() {
        level += 1;
    }

    @Override
    boolean doDamage() {
        if (manaLevel >= 10) {
            manaLevel -= 10;
            return true;
        }
        return false;
    }
}
