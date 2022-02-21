package com.qa.recap;

public abstract class Animal extends Object {

	private String name;

	private int age;

	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public abstract void speak(); // ALL animals CAN speak()

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		if (age >= 0 && age < 25)
			this.age = age;
	}

}
