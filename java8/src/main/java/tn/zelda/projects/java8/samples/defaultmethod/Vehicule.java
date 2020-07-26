package tn.zelda.projects.java8.samples.defaultmethod;

public interface Vehicule {
	
	public void move();
	
	default void hoot() {
		System.out.println("peep!");
	}
}
