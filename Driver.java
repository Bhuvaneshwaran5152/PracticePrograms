package com.full.interfaceExample;

public class Driver implements Printable, Showable {

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void run(Integer number) {
		// TODO Auto-generated method stub
		System.out.println("This is my number " + number);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(Driver.class.getName());

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Displaying comntents");

	}

	@Override
	public void run() {
		System.out.println("I'm running");
		run(10);
	}

	public static void main(String[] args) {
		Driver drive = new Driver();
		drive.run();
		drive.print();
		drive.display();
		int cube = Printable.cube(10);
		System.out.println(cube);
	}

}
