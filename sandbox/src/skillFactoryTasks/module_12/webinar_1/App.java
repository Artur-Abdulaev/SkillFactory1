package skillFactoryTasks.module_12.webinar_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("1.Use ArrayList\n2.Use LinkedList");
        HashMap<String, String> map = new HashMap<>();
        map.put("File", "Filename");
        Scanner sc = new Scanner(System.in);
        CustomList<String> toDoList = switch (sc.nextLine()) {
            case "1" -> new CustomLinkedList<>();
            default -> new CustomArrayList<>();
        };
        int choose = 3;
        do {
            System.out.println("1.Add item\n2.Show all\n3.Delete item\n4.Exit");
            choose = sc.nextInt();
            if (choose == 1) {
                System.out.println("Enter new todo");
                sc.nextLine();
                toDoList.add(sc.nextLine());
            } else if (choose == 2) {
                System.out.println(toDoList);
            } else if (choose == 3) {
                toDoList.remove(sc.nextInt());
            }
        } while (choose != 4);
    }
}
