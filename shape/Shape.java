package com.full.shape;

interface Shape {

	void input(int inp1, int inp2);

	void area();

	class Triangle implements Shape {

		@Override
		public void input(int inp1, int inp2) {
			System.out.println("Enter the Input for Triangle");
		}

		@Override
		public void area() {
			System.out.println("Area of the triangle iss");
		}

		public static void main(String[] args) {
			Shape shape = new Triangle();
		}

		@Override
		public void input() {
			// TODO Auto-generated method stub

		}

	}

	class Rectangle extends Triangle {

		@Override
		public void input(int inp1, int inp2) {
			// TODO Auto-generated method stub
			System.out.println("Enter the Input for rectangle");
			this.area();
			super.input(inp1, inp2);
		}

		@Override
		public void area() {
			// TODO Auto-generated method stub
			System.out.println("Area of the rectangle");
			super.area();
		}

		public static void main(String[] args) {
			Rectangle rectangle = new Rectangle();
			rectangle.input(10, 11);
			rectangle.area();
//			Triangle triangle = new Triangle();
//			triangle.input();
//			triangle.area();

		}
	}

	void input();

}
