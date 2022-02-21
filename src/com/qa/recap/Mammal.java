package com.qa.recap;

public abstract class Mammal extends Animal {

	private boolean hasFur;

	public Mammal(String name, int age, boolean hasFur) {
		super(name, age);
		this.hasFur = hasFur;
	}

	public boolean isHasFur() {
		return this.hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

}
