package groupAssignment;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to take input i. name of student ii. marks of 5 subjects
		 * and the subject names. Output the individual grades of the subjects as well
		 * as the overall grade. The grade will be assigned as: • A: greater than or
		 * equal to 90 • B+: greater than or equal to 85 and less than 90 • C+: greater
		 * than or equal to 75 and less than 80 • C: greater than or equal to 70 and
		 * less than 75 • D: greater than or equal to 60 and less than 70 • F: Below 60
		 * Example: The output should be as follows: Student Name: John Doe Subjects:
		 * Maths - A Physics - A+ Computer Science - B+ Ecology - F History - C Overall
		 * - B
		 * 
	*/
	
		
		int biology, history, math, computer, english;
		double avg;

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a name");
		String name = sc.nextLine();

		System.out.println("Enter Biology Score");
		biology = sc.nextInt();

		System.out.println("Enter History Score");
		history = sc.nextInt();

		System.out.println("Enter Math Score");
		math = sc.nextInt();

		System.out.println("Enter Computer Score");
		computer = sc.nextInt();

		System.out.println("Enter English Score");
		english = sc.nextInt();

	int[] subjects = { biology, math, computer, history, english };
	String [] sub= {"Biology", "Math", "Computer", "History", "English"};
	
		
	
	for (int i = 0; i < 5; i++) {
		System.out.print(sub[i]);
		if (subjects[i] >= 90) {
		System.out.println("\n Grade A");
		} else if (subjects[i] >= 80) {
		System.out.println("\n Grade B");
		} else if (subjects[i] >= 70 ) {
		System.out.println("\n Grade C");
		} else if (subjects[i] >= 60 ) {
		System.out.println("\n Grade D");
		} else {
		System.out.println("\n F");
		}
		}
	
	avg = (biology + math + computer + history + english) / 5;
	if (avg >= 90) {
	System.out.println("\n Average: A");
	} else if (avg >= 80) {
	System.out.println("\n Average: B");
	} else if (avg >= 70) {
	System.out.println("\n Average: C");
	} else if (avg >= 60) {
	System.out.println("\n Average: D");
	} else  {
	System.out.println("\n Average: F");
	}
	
	
		
	}
}