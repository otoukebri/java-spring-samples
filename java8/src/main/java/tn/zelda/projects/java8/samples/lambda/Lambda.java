package tn.zelda.projects.java8.samples.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import tn.zelda.projects.java8.models.Apple;

public class Lambda {
	
	public static void main(String[] args) {
		
		//launch thread
		Runnable r  = () ->{
			System.out.println("Hello Oussema!");
		};
		r.run();
		//filter greer apple
		List<Apple> apples = Arrays.asList(new Apple(300, "Red"), new Apple(200, "Green"));
		List <Apple> greenApples = filter(apples,(Apple a) ->  "green".equals(a.getColor()) );
		
		// sort apples by weight
		Comparator<Apple> c = (Apple a1 , Apple a2 ) -> {return a1.getWeight().compareTo(a2.getWeight());};
		apples.sort(c);
		System.out.println("sorted apples by weight: \n" + apples);
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
	
}
