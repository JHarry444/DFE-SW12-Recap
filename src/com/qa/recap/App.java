package com.qa.recap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 22 + 24; // expression
		Integer integer = 22 + 24;

		String s = "Hello, World!"; // String literal
		String s2 = new String("Hello, World!");

		System.out.println("Strings:");
		System.out.println(s == "Hello, World!"); // works here becaue string is being reused
		System.out.println(s == s2);
		System.out.println(s.equals(s2));

		System.out.println("Dogs:");
		System.out.println("Are they ==? " + (new Dog("Rex") == new Dog("Rex")));

		System.out.println("Are they .equals()? " + (new Dog("Rex").equals(new Dog("Rex"))));

		System.out.println(new Dog("Woofy"));

		List<Animal> pets = new ArrayList<>();

		pets.add(new Dog("Rex"));
		pets.add(new Cat("Tiddles", 12));

		for (Animal a : pets) {
			a.speak();
		}

		List<Flyable> flying = new LinkedList<>();

		flying.add(new Bat("Batfink", 42));
		flying.add(new Eagle("Eddy", 33));

		for (Flyable f : flying) {
			f.fly();
		}
	}

}
