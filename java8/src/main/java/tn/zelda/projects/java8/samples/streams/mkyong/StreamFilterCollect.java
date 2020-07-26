package tn.zelda.projects.java8.samples.streams.mkyong;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		
		List<String> result = lines.stream() // convert list to a stream
		.filter(line -> !"mkyong".equals(line)) // we dont like mkyong
		.collect(Collectors.toList()); // convert streams to a List 
		result.forEach(System.out::println);
		
	}
}
