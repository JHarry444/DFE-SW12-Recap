package com.qa.recap;

public class Eagle extends FlyingBird {

	public Eagle(String name, int age) {
		super(name, age);
	}

	@Override
	public void speak() {
		System.out.println("Disappointing squawk");
	}

}
