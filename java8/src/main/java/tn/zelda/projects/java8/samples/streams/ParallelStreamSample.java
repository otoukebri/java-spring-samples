package tn.zelda.projects.java8.samples.streams;

import java.util.Arrays;

/**
 * Created by zelda on 15/01/17.
 */
public class ParallelStreamSample {
    public static void main(String[] args) {

        //Arrays.asList("Germany", "England",
        //        "China", "Denmark", "Brazil").parallelStream().forEach(System.out::println);

        Arrays.asList("Germany", "England",
                "China", "Denmark", "Brazil").parallelStream().forEachOrdered(System.out::println);
    }
}
