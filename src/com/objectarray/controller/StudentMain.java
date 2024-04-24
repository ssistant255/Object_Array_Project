package com.objectarray.controller;

import com.objectarray.pojo.Student;

public class StudentMain {
	
		public static void main(String args[])
		{
		//Student s1 =  new Student(1, "Darshan",80);
		//System.out.println(s1.getRollno()+" "+s1.getName()+" "+s1.getMarks());
		//s1.setMarks(78);
		//System.out.println(s1.getRollno()+" "+s1.getName()+" "+s1.getMarks());
		
		Student s1[]=new Student[5];
		int i;
		int length=0;
		s1[0]=new Student(1, "darshan",80);
		s1[1]=new Student(2, "nikit",45);
		s1[2]=new Student(3, "shweta",34);
		s1[3]=new Student(4, "raj",67);
		s1[4]=new Student(6, "vijay",78);
		System.out.println(s1[0].getRollno()+" " +" "+s1[0].getName()+" "+s1[0].getMarks());
		System.out.println(s1[1].getRollno()+" " +" "+s1[1].getName()+" "+s1[1].getMarks());
		System.out.println(s1[2].getRollno()+" " +" "+s1[2].getName()+" "+s1[2].getMarks());
		System.out.println(s1[3].getRollno()+" " +" "+s1[3].getName()+" "+s1[3].getMarks());
		System.out.println(s1[4].getRollno()+" " +" "+s1[4].getName()+" "+s1[4].getMarks());
		for( i=0;i<length;i++);
				{

					System.out.println(s1[i].getRollno()+" " +" "+s1[i].getName()+" "+s1[i].getMarks());
					
				}
	}
}
