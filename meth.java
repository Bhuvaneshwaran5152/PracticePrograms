package com.full.abstractClass;

interface meth {
	void a();

	void b();

	void c();

	void d();
}

abstract class A implements meth {

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("I am A");
	}

}

class B extends A {

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("I am B");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("I am C");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("I am D");
	}

}

class M {
	public static void main(String[] args) {
		B obj = new B();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
	}
}
