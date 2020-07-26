package tn.zelda.projects.java8.samples.concurency;

/**
 * Created by zelda on 23/01/17.
 */
public class ThreadSample {

    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");

    }
}
