package skillFactoryTasks.module_6.Task1;

public class Barracks {

    Soldier[] army;
    int count;

    public Barracks(){
        army = new Soldier[3];
        count = 0;
    }

    public void add(Soldier s){
        if(count < army.length){
            army[count] = s;
            count++;
        } else System.out.println("��������� ������ ����");
    }

    public void visit(){
        for (int i = 0; i < army.length; i++) {
            if(army[i] != null) army[i].sound();
        }
    }

}
