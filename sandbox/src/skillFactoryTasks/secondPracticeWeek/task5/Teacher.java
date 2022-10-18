package skillFactoryTasks.secondPracticeWeek.task5;

public class Teacher extends People {

    String subject;

    public Teacher(String name, String profession, int age, String subject) {
        super(name, profession, age);
        this.subject = subject;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getProfession() {
        return super.getProfession();
    }

    public String getSubject() {
        return subject;
    }

    String giveALesson() {
        return "The lesson was ended";
    }
}
