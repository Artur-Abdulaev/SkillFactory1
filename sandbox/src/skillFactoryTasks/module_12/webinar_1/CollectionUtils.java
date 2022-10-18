package skillFactoryTasks.module_12.webinar_1;

import java.util.List;

public class CollectionUtils {
    public static void printList(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void printListSum(List<? extends Number> list) {
        int val = 0;
        for (Number o : list) {
            val += o.intValue();
        }
        System.out.println(val);
    }

    public static void insertNumbers(List<? super Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
    }
}
