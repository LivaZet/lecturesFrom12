package com.accenture.lecture18;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee (int id, String firstName, String lastName, int salary){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getName() {
		return firstName + lastName;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary(){
		return this.salary * 12;
	}
	
	public int raiseSalary(int percent){
		int newSalary = this.salary + (this.salary * percent / 100);
		this.salary = newSalary;
		return newSalary;
	}
	
	@Override
	public String toString() {
		return "Employees [id = " + id + ", name = " + firstName + " " + lastName + " " + 
				", salary = " + this.salary + "]";
	}
	
	
}
