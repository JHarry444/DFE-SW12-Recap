package com.qa.recap.animals;

public class Bat extends Mammal implements Flyable {

	public Bat(String name, int age) {
		super(name, age, true);
	}

	@Override
	public void speak() {
		System.out.println("My super sonic sonar radar will hep me");
	}

	@Override
	public void fly() {
		System.out.println("Flaps leatherly");
	}

}
