package groupAssignment;

import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {

		/*
		 * 
		 * Write a Java program to sort an array in ascending order. Also output the
		 * 
		 * average of the elements of the array. Input: [2, 5, 6, 4, 8] Output: [2, 4,
		 * 
		 * 5, 6, 8] Average: 5
		 * 
		 */

		int n, temp;

		double total = 0;

		Scanner s = new Scanner(System.in);

		System.out.print("How many numbers do you want to sort:");

		n = s.nextInt();

		int a[] = new int[n];

		System.out.println("What are the numbers:");

		for (int i = 0; i < n; i++) {

			a[i] = s.nextInt();

		}

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				if (a[i] > a[j]) {

					temp = a[i];

					a[i] = a[j];

					a[j] = temp;

				}

			}

		}

		System.out.print("Ascending Order:");

		for (int i = 0; i < n - 1; i++) {

			System.out.print(a[i] + ",");

		}

		System.out.println(a[n - 1]);

		for (int i = 0; i < a.length; i++)

			total = total + a[i];

		double average = total / a.length;

		System.out.println("Average: " + average);

	}

}
