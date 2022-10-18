package skillFactoryTasks.module_12.webinar_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class UtilsTest {
    public static void main(String[] args) {
        CollectionUtils.printList(new LinkedList<Object>());
        CollectionUtils.printList(new LinkedList<Number>());
        CollectionUtils.printList(new LinkedList<String>());
        CollectionUtils.printList(new LinkedList<ArrayList<String>>());
        CollectionUtils.printListSum(new LinkedList<Number>());
        CollectionUtils.printListSum(new LinkedList<Integer>());
//
//        CollectionUtils.insertNumbers(new LinkedList<>(String));
//        CollectionUtils.insertNumbers(new LinkedList<>(Double));
//        CollectionUtils.insertNumbers(new LinkedList<>(Number));
//        CollectionUtils.insertNumbers(new LinkedList<>(Integer));
    }
}
