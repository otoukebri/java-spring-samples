package tn.zelda.projects.java8.samples;

/**
 * Created by zelda on 15/01/17.
 */

@FunctionalInterface
public interface Converter<F,T> {
    T convert(F from);
}
