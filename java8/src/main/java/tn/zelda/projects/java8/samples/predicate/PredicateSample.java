package tn.zelda.projects.java8.samples.predicate;

import java.util.Objects;
import java.util.function.Predicate;

/**
 * Created by zelda on 15/01/17.
 */
public class PredicateSample {

    public static void main(String[] args) {

        Predicate<String> predicate = (s) -> s.length() > 0;
        boolean c = predicate.test("foo");       // true
        System.out.println("legnth > 0 ? " + c);
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;
        boolean k = isNull.test(null);
        System.out.println("is object null ? " + k );
        Predicate<String> isEmpty = String::isEmpty;
        boolean  l = isEmpty.test("");
        System.out.println("is string empty ? " + l );
        Predicate<String> isNotEmpty = isEmpty.negate();
    }
}
