package tn.zelda.projects.java8.samples.functionalInterface;

public class MyFunctionalInterfaceTester {

    public static void main(String[] args) {
        MyFunctionalInterface formula = new MyFunctionalInterface() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };
        formula.calculate(100);
        formula.sqrt(16);

    }

}
