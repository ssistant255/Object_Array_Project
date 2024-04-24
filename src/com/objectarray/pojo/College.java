package com.objectarray.pojo;
public class 	College
{
	private int collgeid;
	private String collegename;
	private String facult;
	private double  studentcount;
	private String address;
	public int getCollgeid() 
	{
		return collgeid;
	}
	public void setCollgeid(int collgeid) 
	{
		this.collgeid = collgeid;
	}
	public String getCollegename() 
	{
		return collegename;
	}
	public void setCollegename(String collegename) 
	{
		this.collegename = collegename;
	}
	public String getFacult()
	{
		return facult;
	}
	public void setFacult(String facult) 
	{
		this.facult = facult;
	}
	public double getStudentcount() 
	{
		return studentcount;
	}
	public void setStudentcount(double studentcount) 
	{
		this.studentcount = studentcount;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	    public College(int collgeid, String collegename, String facult, double studentcount, String address) {
		this.collgeid = collgeid;
		this.collegename = collegename;
		this.facult = facult;
		this.studentcount = studentcount;
		this.address = address;
	}
}
