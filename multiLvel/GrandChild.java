package com.full.inheritance.multiLvel;

public class GrandChild extends Child {

	public GrandChild() {
		// TODO Auto-generated constructor stub
	}

	public void greet() {
		System.out.println("Hi from Grandchild");
	}

	public static void main(String[] args) {
		GrandChild child = new GrandChild();
		child.greet();
		child.print1();
		child.print();
	}
}
