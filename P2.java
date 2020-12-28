// Program 2 is completely working done with comments

package groupAssignment;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {

		/*
		 * 
		 * Write a Java program to check if an entered year is a leap year or not. Also
		 * 
		 * print the leap years in next 10 years and previous 10 years from the year
		 * 
		 * given by the user. Input: 2010 Output: 2010 is not a leap year The leap years
		 * 
		 * in the previous 10 years are: 2000, 2004, 2008 The leap years in the next 10
		 * 
		 * years are: 2012, 2016, 2020
		 * 
		 */

		System.out.print("Please enter the year you wish to check for leap year "); // promt

		Scanner sc = new Scanner(System.in); // user input scanner

		int year = sc.nextInt(); // take integer value

		int lyear = year;

		// conditions for the leap year if it is true
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

			System.out.println(year + " is a Leap Year");

		}

		// if not true conditions for the leap year inputted
		else {

			System.out.println(year + " is NOT Leap Year");

		}

		System.out.print("\n"); // just empty line

		// loop and conditions for next 10 years
		System.out.println("The Leap years for the last 10 years since " + year + " are: ");

		for (int i = 0; i < 10; i++) {

			year--;

			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

				System.out.print(year + " ");

			}

		}

		System.out.print("\n");

		System.out.println("The Leap years for the Next 10 years since " + lyear + " are: ");

		for (int i = 0; i < 10; i++) {

			lyear = lyear + 1;

			//// loop and conditions for past 10 years
			if ((lyear % 400 == 0) || ((lyear % 4 == 0) && (lyear % 100 != 0))) {

				System.out.print(lyear + " ");

			}

		}

	}

}
