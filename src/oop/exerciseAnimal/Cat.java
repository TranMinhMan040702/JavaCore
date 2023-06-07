package oop.exerciseAnimal;

public class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void sayHello() {
		System.out.println("Cat sound Meo Meo");
	}
}
