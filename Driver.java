package com.full.encapsulation;

public class Driver {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.setEmpNo(1);
		employee1.setName("Bhuvan");
		employee1.setSalary(100000);

		Employee employee2 = new Employee("Karthik", 2, 150000);
		employee2.setSalary(125000);

		System.out.println(
				"name :" + employee1.getName() + "  ID :" + employee1.getEmpNo() + " salary :" + employee1.getSalary());
		System.out.println(
				"name :" + employee2.getName() + " ID :" + employee2.getEmpNo() + " salary :" + employee2.getSalary());
	}

}
