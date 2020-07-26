package tn.zelda.projects.java8.samples.functions;

import java.util.function.Function;

/**
 * Created by zelda on 15/01/17.
 */
public class FunctionInterfaceDemo {
    public static void main(String[] args) {

        Function<String, Integer> length = str -> str.length();
        System.out.println("Length of string 'Hello World' is " + length.apply("Hello World"));

        Function<String, Integer> toInteger = Integer::valueOf;
        System.out.printf("int value " + toInteger.apply("123"));

    }
}
