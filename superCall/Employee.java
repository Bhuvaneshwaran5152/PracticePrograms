package com.full.superCall;

public class Employee extends Person {

	Employee(int num, String name, float salary) {
		super(num, name);
		// TODO Auto-generated constructor stub
		this.salary = salary;
	}

	float salary;

	void display() {
		System.out.println(num + " " + name + " " + salary);
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Bhuvan", 20000);
		emp1.display();
		Employee emp2 = new Employee(2, "Karthik", 20000);
		emp2.display();
	}

}
