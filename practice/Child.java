package com.full.inheritance.practice;

public class Child implements Parent, Parent1 {

	public static void main(String[] args) {
		Child child = new Child();
		child.hello(2);
	}

	@Override
	public void hello(int num) {
		// TODO Auto-generated method stub
		System.out.println(num);
	}

}
