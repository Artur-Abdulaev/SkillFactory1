package skillFactoryTasks.module_13;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread() {
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.currentThread().start(); // 1
            }
        };
        t1.start(); // 2
        t1.join();

    }
}
