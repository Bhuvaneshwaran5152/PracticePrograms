package com.full.inheritance.hierarchical;

class Shape {

	void printArea(long area) {
		System.out.println("Area = " + area);
	}
}

class Square extends Shape {

	long calculateArea(long side) {
		return side * side;
	}
}

class Rectangle extends Square {

	long calculateArea(long l, long b) {
		return l * b;
	}

	public static void main(String[] args) {
		long area;
		Square squareObj = new Square();
		Rectangle rectangleObj = new Rectangle();
		area = squareObj.calculateArea(3);
		squareObj.printArea(area);
		area = rectangleObj.calculateArea(3, 2);
		rectangleObj.printArea(area);

	}
}
