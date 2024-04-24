package com.objectarray.controller;
import com.objectarray.pojo.College;
import com.objectarray.pojo.Student;
public class CollegeMain 
{

	public static void main(String args[])
	{
		College c1[]=new College[5];
		int i;
		c1[0]=new College(1,"vidyalankar ","java",70,"wadala");
		c1[1]=new College(2,"tilak", "c#",30,"thane");
		c1[2]=new College(3,"modern", "linux",34,"bhandup");
		c1[3]=new College(4,"R.D college", "PGIS",56,"sion");
		c1[4]=new College(5,"k.J somaiya", "NGT",45,"vashi");
		System.out.println(c1[0].getCollgeid()+" " +" "+c1[0].getCollegename()+" "+c1[0].getFacult()+" "+c1[0].getStudentcount()+" "+c1[0].getAddress());
		System.out.println(c1[1].getCollgeid()+" " +" "+c1[1].getCollegename()+" "+c1[1].getFacult()+" "+c1[1].getStudentcount()+" "+c1[1].getAddress());
		System.out.println(c1[2].getCollgeid()+" " +" "+c1[2].getCollegename()+" "+c1[2].getFacult()+" "+c1[2].getStudentcount()+" "+c1[2].getAddress());
		System.out.println(c1[3].getCollgeid()+" " +" "+c1[3].getCollegename()+" "+c1[3].getFacult()+" "+c1[3].getStudentcount()+" "+c1[3].getAddress());
		System.out.println(c1[4].getCollgeid()+" " +" "+c1[4].getCollegename()+" "+c1[4].getFacult()+" "+c1[4].getStudentcount()+" "+c1[4].getAddress());
		for( i=0;i<5;i++);
		{

			System.out.println(c1[i].getCollgeid()+" " +" "+c1[i].getCollegename()+" "+c1[i].getFacult()+" "+c1[i].getStudentcount()+" "+c1[i].getAddress());	
		}
	}
}
