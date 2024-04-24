package com.objectarray.pojo;
import java.util.List;
import java.util.Scanner;
public class Question 
	{

		private String text;
	    private String[] options;
	    private int correctAnswerIndex;
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String[] getOptions() {
			return options;
		}
		public void setOptions(String[] options) {
			this.options = options;
		}
		public int getCorrectAnswerIndex() {
			return correctAnswerIndex;
		}
		public void setCorrectAnswerIndex(int correctAnswerIndex) {
			this.correctAnswerIndex = correctAnswerIndex;
		}
		public Question() 
		{
			this.text = text;
			this.options = options;
			this.correctAnswerIndex = correctAnswerIndex;
		}
	}

	   