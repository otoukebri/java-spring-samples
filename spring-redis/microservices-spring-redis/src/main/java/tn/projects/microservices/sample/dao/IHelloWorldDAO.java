package tn.projects.microservices.sample.dao;

import java.util.List;

/**
 * @author Mickael BARON
 */
public interface IHelloWorldDAO {

	/**
	 * @return
	 */
	List<HelloWorld> getHelloWorlds();
	
	/**
	 * @param newHelloWorld
	 */
	void addHelloWorld(HelloWorld newHelloWorld);
}
