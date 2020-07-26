package tn.zelda.projects.java8.samples.lambda;

import tn.zelda.projects.java8.samples.Converter;

/**
 * Created by zelda on 14/01/17.
 */
public class MethodConstructorReference {

    public static void main(String[] args) {

        Converter<String, Integer> converter = Integer::valueOf;
        Integer converted = converter.convert("123");
        System.out.println(converted);   // 123

    }
}
