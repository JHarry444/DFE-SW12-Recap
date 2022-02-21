package com.qa.recap;

public class Dog extends Mammal {

	private String breed;

//	public Dog() { // default constructor
//		super(null, 0);
//	}
//
//	public Dog(String name) {
//		// super(); inserted automatically
//		super(name, 0);
//	}

	public Dog(String name, int age, String breed) {
		super(name, age, true);
		this.breed = breed;
	}

	public Dog(String name) {
		super(name, 0, true);
	}

	public String getBreed() {
		return this.breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + this.breed + ", getName()=" + this.getName() + ", getAge()=" + this.getAge() + "]";
	}

	@Override
	public void speak() {
		System.out.println("Bark! Bark!");
	}

}
