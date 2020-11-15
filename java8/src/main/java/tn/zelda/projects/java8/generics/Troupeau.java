package tn.zelda.projects.java8.generics;

import java.util.List;

public class Troupeau<T extends Animal, K extends Animal> {

    List<T> ovins;
    List<K> bovins;

    public <T extends List<Animal>> void display(List<T> animaux) {
        for (T animal : animaux) {
            System.out.println("Troupeau.display");
        }
    }
}
