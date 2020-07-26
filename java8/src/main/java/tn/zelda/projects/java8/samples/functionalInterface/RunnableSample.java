package tn.zelda.projects.java8.samples.functionalInterface;

import java.util.concurrent.TimeUnit;

/**
 * Created by zelda on 15/01/17.
 */
public class RunnableSample {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }
}
