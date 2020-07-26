package tn.zelda.projects.java8.samples.consumers;

import tn.zelda.projects.java8.models.Person;

import java.util.function.Consumer;

/**
 * Created by zelda on 16/01/17.
 */
public class ConsumerSample {

    public static void main(String[] args) {

        Consumer<Person> greeter  = (p) -> System.out.println("firstName: " + p.getFirstName());
        greeter.accept( new Person("Oussema"));
    }
}
