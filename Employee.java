package com.full.encapsulation;

public class Employee {

	private String name;

	private int empNo;

	private double salary;

	Employee(String name, int empNo, double salary) {
		this.name = name;
		this.empNo = empNo;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
