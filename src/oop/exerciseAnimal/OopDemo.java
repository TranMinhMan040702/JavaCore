package oop.exerciseAnimal;

public class OopDemo {
	public static void main(String[] args) {
		Cat cat = new Cat("Tom");
		Dog dog = new Dog("Lu");

		Zoo zoo = new Zoo();
		zoo.add(dog);
		zoo.add(cat);
		zoo.showListAnimal();
	}
}
