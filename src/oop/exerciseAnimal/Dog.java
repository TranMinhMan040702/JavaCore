package oop.exerciseAnimal;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		System.out.println("Dog sound Gau Gau");
	}
}
