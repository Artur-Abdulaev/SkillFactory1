package skillFactoryTasks.module_6.Task1;

public class Main {

    public static void main(String[] args) {

        Barracks barracks = new Barracks();
        barracks.add(new Soldier("���������"));
        barracks.add(new Knight("������"));
        barracks.add(new Rifleman("��������"));barracks.add(new Rifleman("��������"));
        barracks.add(new Rifleman("��������"));

        barracks.visit();
    }
}
