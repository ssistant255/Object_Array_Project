package com.objectarray.pojo;
public class Employee
{
	private int id;
	private String name;
	private double salary;
	private String techinalskills;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getTechinalskills() {
		return techinalskills;
	}
	public void setTechinalskills(String techinalskills) {
		this.techinalskills = techinalskills;
	}
	public Employee(int id, String name, double salary, String techinalskills) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.techinalskills = techinalskills;
	}
}

