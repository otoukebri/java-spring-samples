package tn.zelda.projects.java8.generics;


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
        Ovin ovin1 = new Ovin();
        Animal animal3 = ovin1;

        callMe(bovin2);
        callMe(ovin1);

        Troupeau troupeau = new Troupeau<Ovin, Bovin>();

    }


    private static <T extends Animal> void callMe(T animal) {
//        if (animal instanceof Bovin) {
//            Bovin bovin = (Bovin) animal;
//        }

    }
}
