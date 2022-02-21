package com.qa.recap;

public class Cat extends Animal {

	private boolean isDemon;

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void speak() {
		System.out.println("Meow!");
	}

	public boolean isDemon() {
		return this.isDemon;
	}

	public void setDemon(boolean isDemon) {
		this.isDemon = isDemon;
	}

	@Override
	public String toString() {
		return "Cat [isDemon=" + this.isDemon + ", getName()=" + this.getName() + ", getAge()=" + this.getAge() + "]";
	}

}
