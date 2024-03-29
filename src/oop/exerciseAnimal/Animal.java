package oop.exerciseAnimal;

public abstract class Animal {

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public abstract void sayHello();

	public String getName() {
		return this.name;
	}

}
