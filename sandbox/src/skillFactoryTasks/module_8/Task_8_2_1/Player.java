package skillFactoryTasks.module_8.Task_8_2_1;

public class Player extends Human {

    public Player(String name) {
        super(name);
    }


    public Backpack backpack = new Backpack();



    class Backpack{
        private String staff = "";
        void put(String thing){
            staff += thing +",";
        }
        public String toString(){
            if (staff.equals("")) {
                return "the backpack is empty";
            }
            return staff.substring(0, staff.
                    length()-1) + " in the backpack";
        }
    }

    void take(String item) {
        backpack.put(item);
    }
}



