package tn.zelda.projects.java8.samples.optional;

import javax.swing.text.html.Option;
import java.util.Optional;

/**
 * Created by zelda on 12/07/17.
 */
public class OptionalBasicExample {
    public static void main(String[] args) {
        String  [] toto;
        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: "+ Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));



    }
}
