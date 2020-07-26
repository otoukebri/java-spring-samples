package tn.zelda.projects.java8.samples.optional;

import java.util.Optional;

/**
 * Created by zelda on 16/01/17.
 */
public class OptionalSample {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("bam");
        boolean a = optional.isPresent();           // true
        System.out.println("OptionalSample.main isPresent > "+  a);
        String  b = optional.get();                 // "bam"
        System.out.println("OptionalSample.main .get > " + b);
        String  c = optional.orElse("fallback");    // "bam"
        System.out.println("OptionalSample.main or ELse > " + c);
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }
}
