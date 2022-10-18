package skillFactoryTasks.secondPracticeWeek.task5;

abstract class People {

    String name, profession;
    int age;

    public People(String name, String profession, int age) {
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }
}
