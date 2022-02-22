package com.qa.recap.animals;

public abstract class FlyingBird extends Bird implements Flyable {

	public FlyingBird(String name, int age) {
		super(name, age);
	}

	@Override
	public void fly() {
		System.out.println("Flaps featherly");
	}
}
