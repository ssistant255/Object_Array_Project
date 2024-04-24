   //private int id;
	//private String name;
	//private double salary;
	//private String techinalskills;
package com.objectarray.controller;
import com.objectarray.pojo.College;
import com.objectarray.pojo.Employee;
public class EmployeeMain
{
	public static void main(String args[])
	{
		Employee e1[]=new Employee[5];
		int i;
		e1[0]=new Employee(1,"Darshan ",6000,"software developer");
		e1[1]=new Employee(2,"Shweta",4000,"core developer");
		e1[2]=new Employee(3,"Nikit", 3000,"c++ developer");
		e1[3]=new Employee(4,"Raj",7000,"sql developer");
		e1[4]=new Employee(5,"Harish", 5000,"java script");
		
		System.out.println(e1[0].getId()+" " +" "+e1[0].getName()+" "+e1[0].getSalary()+" "+e1[0].getTechinalskills()+" ");
		System.out.println(e1[1].getId()+" " +" "+e1[1].getName()+" "+e1[1].getSalary()+" "+e1[1].getTechinalskills()+" ");
		System.out.println(e1[2].getId()+" " +" "+e1[2].getName()+" "+e1[2].getSalary()+" "+e1[2].getTechinalskills()+" ");
		System.out.println(e1[0].getId()+" " +" "+e1[3].getName()+" "+e1[3].getSalary()+" "+e1[3].getTechinalskills()+" ");
		System.out.println(e1[4].getId()+" " +" "+e1[4].getName()+" "+e1[4].getSalary()+" "+e1[4].getTechinalskills()+" ");
		for( i=0;i<5;i++);
		{

			System.out.println(e1[i].getId()+" " +" "+e1[i].getName()+" "+e1[i].getSalary()+" "+e1[i].getTechinalskills()+" ");	
		}
	}

}
