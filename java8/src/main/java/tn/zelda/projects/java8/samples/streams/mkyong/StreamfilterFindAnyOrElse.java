package tn.zelda.projects.java8.samples.streams.mkyong;

import java.util.Arrays;
import java.util.List;

public class StreamfilterFindAnyOrElse {

	public static void main(String[] args) {
		
		List<Person> persons = Arrays.asList(
				new Person("Mkyong", 30),
				new Person("Jack", 20),
				new Person("Lawrence", 40)
		);
		
		Person result1 = persons.stream()
			       .filter(x -> "Jack".equals(x.getName()) )
			       .findAny()
			       .orElse(null);
		
		System.out.println(result1);
		Person result2 = persons.stream()
		       .filter(x -> "ahmook".equals(x.getName()) )
		       .findAny()
		       .orElse(null);
		System.out.println(result2);
		
	}
}
