package oop.exerciseAnimal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<Animal> animals = new ArrayList<>();

	public void add(Animal animal) {
		animals.add(animal);
	}

	public void remove(Animal animal) {
		animals.remove(animal);
	}

	public void showListAnimal() {
		animals.stream().forEach(animal -> animal.sayHello());
	}

}
