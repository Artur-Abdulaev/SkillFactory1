package SkillFactoryTasks.FirstPracticeWeek.MediumTasks.Task10;

public class Main {
    public static void main(String[] args) {
        Mage mage1 = new Mage("Invoker",20,20, "ice");

        Mage mage2 = new Mage("Axe", 20, 20, "fire");
        Mage mage3 = new Mage("Lion", 20, 2, "fire");

        System.out.println(mage2 .fight(mage2));


    }
}
