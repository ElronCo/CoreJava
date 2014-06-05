package oop.constructors.two;

import oop.constructors.BaseClass;

public class ChildClass extends BaseClass {

	protected String childClassVar;

	public ChildClass() {
		super("parameter");
		System.out.println("ChildClass");
	}

	public static void main(String[] args) {
		new ChildClass();
	}

}
