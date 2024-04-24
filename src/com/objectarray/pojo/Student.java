package com.objectarray.pojo;

public class Student {

	private int rollno;
	private String name;
	private double marks;
	public int getRollno() 
	{
		return rollno;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getMarks() 
	{
		return marks;
	}
	public void setMarks(double marks) 
	{
		this.marks = marks;
	}
	public Student(int rollno, String name, double marks) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
}
