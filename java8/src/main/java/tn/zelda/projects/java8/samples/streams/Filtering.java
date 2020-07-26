package tn.zelda.projects.java8.samples.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import tn.zelda.projects.java8.models.Apple;

/**
 * 
 * @author zelda
 * Filtering Using predicate
 */
public class Filtering {

	private final static String GREEN = "Green";

	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple(10, "Red"), new Apple(200, "Green"));
		filter(apples , new AppleColorPredicate());
	}
	
	public static List<Apple> filter(List<Apple> apples, Predicate<Apple> predicate){
		List<Apple> agreenApples = new ArrayList<Apple>();
		apples.forEach((apple) -> {
			if (predicate.test(apple)) {
				agreenApples.add(apple);
			}
		});
		System.out.println(agreenApples);
		return agreenApples;
	}

	static class AppleColorPredicate implements Predicate<Apple> {

		@Override
		public boolean test(Apple apple) {
			return apple.getColor().equals(GREEN);
		}

	}

}