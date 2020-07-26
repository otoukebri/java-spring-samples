package tn.zelda.projects.java8.samples.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamDemo {
 
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }
 
        // Process data sequentially
        long startTime = System.currentTimeMillis();
        numbers.stream().forEach(i -> processElement(i));
        long endTime = System.currentTimeMillis();
        double timeTaken = (endTime - startTime) / 1000;
        System.out.println("Time taken with stream() : " + timeTaken
                + " milliseconds");
 
        // Process data in parallel
        startTime = System.currentTimeMillis();
        numbers.parallelStream().forEach(i -> processElement(i));
        endTime = System.currentTimeMillis();
        timeTaken = (endTime - startTime) / 1000;
        System.out.println("Time taken with parallelStream() : " + timeTaken
                + " milliseconds");
    }
 
    private static void processElement(int num) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
}