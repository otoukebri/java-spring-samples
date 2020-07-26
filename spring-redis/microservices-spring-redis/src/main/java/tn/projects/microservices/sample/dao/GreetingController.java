package tn.projects.microservices.sample.dao;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@Autowired
	private IHelloWorldDAO currentDAO;

	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	@ResponseStatus(value = HttpStatus.OK)
	public List<HelloWorld> getHelloWorlds() {
		List<HelloWorld> l = currentDAO.getHelloWorlds();
		return l;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/hello")
	@ResponseStatus(value = HttpStatus.OK)
	public void postHelloWorld(@RequestBody HelloWorld newHelloWorld) {
		currentDAO.addHelloWorld(newHelloWorld);
	}	

}
