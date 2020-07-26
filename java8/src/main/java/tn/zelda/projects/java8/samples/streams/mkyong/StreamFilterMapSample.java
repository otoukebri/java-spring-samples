package tn.zelda.projects.java8.samples.streams.mkyong;

import java.util.Arrays;
import java.util.List;

public class StreamFilterMapSample {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
                new Person("mkyong", 30),
                new Person("jack", 20),
                new Person("lawrence", 40)
        );
		
		String name = persons.stream()
		       .filter(x  -> "Jack".equals(x.getName()))
		       .map(Person::getName)
		       .findAny()
		       .orElse("");
		System.out.println("name : " + name);	
		
	}
}
