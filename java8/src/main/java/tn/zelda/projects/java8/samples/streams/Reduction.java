package tn.zelda.projects.java8.samples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import tn.zelda.projects.java8.models.Dish;

public class Reduction {

	private static List<Dish> getDishes(){
		return Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 400, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));
	}
	
	public static void main(String[] args) {
		List<Dish>  getDishes= getDishes();
		
		//filter with predicate
		List <Dish> vegiterian = getDishes.stream().filter(Dish::isVegetarian).collect(Collectors.toList());
		vegiterian.forEach((d)->{System.out.println(d);});
	}
}
