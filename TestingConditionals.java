package Lecture7;

import java.util.Scanner;

public class TestingConditionals {

	public static void main(String[] args) {

		//taking user inputs
		Scanner sc = new Scanner(System.in);
		
		//Prompt the user
		System.out.print("Enter the score: ");
		
		//read the input from user 
		// sc.nextDouble reads the user input and saves it to variable score
		double score = sc.nextDouble();
		
		
		//similar methods: sc.next() to read string
		//sc.nextInt() to read integers
		//sc.nextLine() to read a line
		System.out.println("You have entered: " + score);
		
		/*
		if (score>=90) {
			System.out.println("Grade is: A");
		}
		
		else if (score>=80) {
			System.out.println("Grade is: B");
		}
		else if (score>=70) {
			System.out.println("Grade is: C");
		}
		else if (score>=60) {
			System.out.println("Grade is: D");
		}
		else  {
			System.out.println("Grade is: F");
		}
		*/
		//take 2

		if (score>=90 && score<=100) {
			System.out.println("Grade is: A");
		}
		
		else if (score>=80 && score<80) {
			System.out.println("Grade is: B");
		}
		else if (score>=70 && score<70) {
			System.out.println("Grade is: C");
		}
		else if (score>=60 && score<60) {
			System.out.println("Grade is: D");
		}
		else  {
			System.out.println("Grade is: F");
		}
		
		
		//take 3
		//Checking two conditions using AND operator
		//OR \\ instead of &&
		
		/*
		if (score>=90) {
			System.out.println("Grade is: A");
		}
		
		else if (score>=80) {
			System.out.println("Grade is: B");
		}
		else if (score>=70) {
			System.out.println("Grade is: C");
		}
		else if (score>=60) {
			System.out.println("Grade is: D");
		}
		else  {
			System.out.println("Grade is: F");
		}
		*/
		
		String grade = (score>=90)? "A": "Less than A";
		System.out.println("Grade: " + grade );
		
	}

}
