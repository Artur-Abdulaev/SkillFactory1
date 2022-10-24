package skillFactoryTasks.module_13;

import static skillFactoryTasks.module_13.CheckResults.counter;

public class CheckResults {
    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new Runner());
        thread.start();



        while (counter < 100) {
            System.out.println("Not reached yet");
            Thread.sleep(1000); // 1 секунда
        }
        System.out.println("Reached");
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter++;
        }
    }
}
