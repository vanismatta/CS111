package groupAssignment;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {

		/*
		 * Write a Java program to take a string input from the user and find the number
		 * of vowels and
		 * 
		 * number of consonants in the string.
		 * 
		 * Input: This is the introduction to computer concepts.
		 * 
		 * Output:
		 * 
		 * Vowels: 14
		 * 
		 * Consonants: 25
		 * 
		 */

		String line;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sentence");

		line = sc.nextLine();

		int vowels = 0, consonants = 0;

		line = line.toLowerCase();

		for (int i = 0; i < line.length(); ++i)

		{

			char ch = line.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i'

					|| ch == 'o' || ch == 'u') {

				++vowels;

			}

			else if ((ch >= 'a' && ch <= 'z')) {

				++consonants;

			}

		}

		System.out.println("Vowels: " + vowels);

		System.out.println("Consonants: " + consonants);

	}

}