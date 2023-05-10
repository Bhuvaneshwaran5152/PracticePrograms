package com.full.shape;

import java.util.Scanner;

public class Rectangle extends Triangle {

	@Override
	public void input() {
		// TODO Auto-generated method stub
		System.out.println("Enter the Input for rectangle");
		super.input();
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area of the rectangle");
		super.area();
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.input(10, 10);
		rectangle.area();
//		Triangle triangle = new Triangle();
//		triangle.input();
//		triangle.area();

	}
}
