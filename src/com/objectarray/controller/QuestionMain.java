//Quiz Game:

//Create a Question class with attributes like text, options, and correct answer.
//Create an array to store Question objects.
//Implement methods to:
//Display questions and accept user answers.
//Check answers and provide feedback
//Keep track of score and display results.
package com.objectarray.controller;
import java.util.Scanner;
import com.objectarray.pojo.Question  ;

public class QuestionMain
{

	public static void main(String args[])
	{
        Question quizQuestions = new Question();
        Scanner sc=new Scanner(System.in);
        System.out.println("Weclome To QUIZ Management GAME!");
        while(true)
        {
        	 System.out.println("\nMenu:");
        	System.out.println("1.Display questions.");
        	System.out.println("2.accept user answers.");
        	System.out.println("3.Check answers.");
        	System.out.println("4.provide feedback.");
        	System.out.println("5.Keep track of score.");
        	System.out.println("6.Display results.");
        	System.out.print("Select an option: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
            case 1:
            	System.out.println("Enter the display question");
            	String displayquestion =sc.next();
            	sc.nextLine();
            	break;
            	
            	case 2:
            	System.out.println("Enter the accept user answer");
            	String useranswer =sc.next();
            	sc.nextLine();
            	break;
            	
            	case 3:
            		System.out.println("Check answers");
            		String checkanswer =sc.next();
            		sc.nextLine();
                	break;
                	
                	
            	case 4:
            		System.out.println("provide feedback");
            		String providefeedback =sc.next();
            		sc.nextLine();
                	break;
                	
            	case 5:
            		System.out.println("Keep track of score");
            		float trackscore=sc.nextFloat();
            		sc.nextLine();
                	break;
                	
            	case 6:
            		System.out.println("Display results");
            		float displayresult=sc.nextFloat();
            		sc.nextLine();
                	break;
                	
            	 default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	                     break;
            	
               }
            }
        }  
}



