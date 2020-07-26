package tn.zelda.projects.java8.samples.functionalInterface;

@FunctionalInterface
public interface MyFunctionalInterface {
    double calculate(int a);

	default double sqrt(double a) {
        return Math.sqrt(a);

    }

}
