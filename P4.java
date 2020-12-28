package groupAssignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to take multiple strings from user and then output the
		 * strings in reverse alphabetical order (opposite of dictionary). Input: Apple,
		 * Zoo, Ball, Cat, Banana Output: Zoo, Cat, Banana, Ball, Apple
		 */

//MAKE REVERSE ALPHABETICAL
		//MAKE REVERSE ALPHABETICAL
//MAKE REVERSE ALPHABETICAL
		//MAKE REVERSE ALPHABETICAL

		int u;
		String temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of names you want to enter:");
		u = s.nextInt();

		String names[] = new String[u];
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter all the names:");

		for (int i = 0; i < u; i++) {
			names[i] = s1.nextLine();
		}

		for (int i = 0; i < u; i++) {
			for (int j = i + 1; j < u; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.print("Names in Sorted Order:");

		// Reverse alphabatical function array to reverse the earlier one
		Arrays.sort(names, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));

		System.out.println(Arrays.toString(names));
		
	}
}
