package com.qa.recap.animals;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<Animal> animals = new ArrayList<>();

	// 1
//	public void addAnimal(String name, int age) {
//		this.animals.add(new Animal(name, age));
//	}

	// 2 - Works with any kind of animal (including new/changed ones)
	public void addAnimal(Animal a) {
		this.animals.add(a);
	}

	public void removeAnimal(Animal a) {
		this.animals.remove(a);
	}

	public void print() {
		System.out.println(this.animals);
	}
}
