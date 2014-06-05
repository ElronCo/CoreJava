package oop.animal;

public abstract class Mammal extends Animal {

	public Mammal(String name, int age) {
		super(name, age);
	}

	public abstract void feedBaby();

}
