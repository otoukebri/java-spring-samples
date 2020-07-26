package tn.zelda.projects.java8.samples.functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class AllExample {

	public static void main(String[] args) {
		Consumer <String> nameConsumer = (name) -> System.out.println(name);
		nameConsumer.accept("Hello consumer");
		
		Supplier<String> supplier =  () -> new String("Hello supplier");
		String str = supplier.get();
		System.out.println(str);
		
		Function<Employee, String>  f = (Employee e) ->  e.getName() + "";
		String employeeName = f.apply(new Employee("Hello function"));
		System.out.println(employeeName);
		
	}
}
