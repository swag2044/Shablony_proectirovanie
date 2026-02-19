public class Main_m5_pr_logger {
    public static void main(String[] args) throws InterruptedException {

        Logger logger = Logger.getInstance();

        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++)
                logger.log("Message from Thread 1", LogLevel.INFO);
        };

        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++)
                logger.log("Warning from Thread 2", LogLevel.WARNING);
        };

        Runnable task3 = () -> {
            for (int i = 0; i < 5; i++)
                logger.log("Error from Thread 3", LogLevel.ERROR);
        };

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("Logging finished.");
    }
}
