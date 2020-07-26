package tn.zelda.projects.java8.samples.concurency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureSample {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");
		System.out.println(future.get());
		CompletableFuture<String> task = invoke();
		System.out.println(task.get());
	}
	
	public static CompletableFuture<String> invoke() {
		return CompletableFuture.supplyAsync(CompletableFutureSample::sendMessage);
	}
	
	public static String sendMessage() {
		System.out.println("do some task!");
		return "Hi";
	} 

}
