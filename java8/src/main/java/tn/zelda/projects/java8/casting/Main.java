package tn.zelda.projects.java8.casting;

public class Main {
    public static void main(String[] args) {

        // ClassCastException
        // Animal animal = new Animal();
        // Bovin bovin = (Bovin) animal;

        // up casting
        Animal bovin = new Bovin();
        Bovin animal1 = (Bovin) bovin;

        // down casting
        Bovin bovin2 = new Bovin();
        Animal animal2 = bovin2;

        // mix
        Ovin ovin = new Ovin();
        callMe(bovin2);
        callMe(ovin);

    }


    public static void callMe(Animal animal) {
        if (animal instanceof Bovin) {
            Bovin bovin = (Bovin) animal;
        }

    }

}
