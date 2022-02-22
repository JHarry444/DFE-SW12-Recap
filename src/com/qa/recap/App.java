package com.qa.recap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.qa.recap.animals.Animal;
import com.qa.recap.animals.Bat;
import com.qa.recap.animals.Cat;
import com.qa.recap.animals.Dog;
import com.qa.recap.animals.Eagle;
import com.qa.recap.animals.Flyable;
import com.qa.recap.animals.Zoo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 22 + 24; // expression
		Integer integer = 22 + 24;

		String s = "Hello, World!"; // String literal
		String s2 = new String("Hello, World!");

		System.out.println("Strings:");
		System.out.println(s == "Hello, World!"); // works here because string is being reused
		System.out.println(s == s2);
		System.out.println(s.equals(s2));

		System.out.println("Dogs:");
		System.out.println("Are they ==? " + (new Dog("Rex") == new Dog("Rex")));

		System.out.println("Are they .equals()? " + (new Dog("Rex").equals(new Dog("Rex"))));

		System.out.println(new Dog("Woofy"));

		List<Integer> nums = new ArrayList<>();

		nums.add(12);
		nums.add(27);
		nums.add(33);

		Animal[] animals = { new Dog("Rex"), new Cat("Tiddles", 12) };
		animals = new Animal[2]; // { null, null }

		System.out.println("Animals[1]: " + animals[1]);

//		animals[2] = new Eagle("Eddy", 33); // try to set at a position that doesn't exist

		List<Animal> pets = new ArrayList<>();

		pets.add(new Dog("Rex"));
		pets.add(new Cat("Tiddles", 12));

		for (Animal a : pets) {
			a.speak();
			System.out.println(a);
		}

		List<Flyable> flying = new LinkedList<>();

		flying.add(new Bat("Batfink", 42));
		flying.add(new Eagle("Eddy", 33));

		for (Flyable f : flying) {
			f.fly();
		}

		Zoo zoo = new Zoo();
		zoo.addAnimal(new Eagle("Earl", 22));
		zoo.addAnimal(new Bat("Barry", 6));
		zoo.addAnimal(new Dog("Spot", 12, "Sausage"));
		zoo.print();
	}

}
