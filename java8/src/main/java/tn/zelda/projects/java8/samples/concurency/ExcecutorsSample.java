package tn.zelda.projects.java8.samples.concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zelda on 23/01/17.
 */
public class ExcecutorsSample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        });

// => Hello pool-1-thread-1
    }
}
