package tn.zelda.projects.java8.models;


public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;
	
	
	public enum Type {
		MEAT, FISH, OTHER
	}

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }


	@Override
	public String toString() {
		return name;
	}


	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}


	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}


	/**
	 * @return the vegetarian
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
