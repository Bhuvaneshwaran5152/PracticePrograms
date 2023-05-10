package com.full.inheritance.hybrid;

public class SubClass implements Super {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}

	public static void main(String[] args) {
		SubClass class1 = new SubClass();
		class1.run();
		class1.stop();
	}

}
