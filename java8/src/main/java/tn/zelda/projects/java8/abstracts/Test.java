package tn.zelda.projects.java8.abstracts;

public class Test extends  BaseClass {

    @Override
    void sayBonjour() {
        System.out.println("Test.sayBonjour");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.sayHi();
    }
}
