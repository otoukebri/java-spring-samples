package tn.zelda.projects.java8.samples.optional;

import tn.zelda.projects.java8.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by zelda on 24/01/17.
 */
public class OptionalSample2 {

    public static void main(String[] args) {
        List<Optional<Employee>> intList = new ArrayList<Optional<Employee>>();
        intList.add(Optional.empty());
        intList.add(Optional.of(new Employee("abc")));
        intList.add(Optional.of(new Employee("xyz")));
        intList.add(Optional.of(new Employee("123")));
        System.out.println(intList.get(1).toString());//getName()

    }
}
