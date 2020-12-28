package groupAssignment;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		/*
		 * Write a Java program to input 5 numbers from user and output the sum of the
		 * even numbers and sum of odd numbers. Example: User enters 2, 17, 76, 49, 26
		 * Output: Odd numbers: 17, 49 The sum of the odd numbers is 66 Even Numbers: 2,
		 * 76, 26 The sum of the even numbers is 104
		 */

		int num = 5;
		int sumofEven = 0;
		int sumofOdd = 0;

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[num];

		System.out.println("Enter the 5 numbers");
		for (int i = 0; i < num; i++) {

			System.out.println("enter number " + (i + 1) + ":");
			arr[i] = sc.nextInt();
		}

		// use two separate arrays for even and odd and save them to each array
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				sumofEven = arr[i] + sumofEven;
				System.out.println("Even numbers: " + arr[i]);
			}
		}

		System.out.println("Sum of Even numbers " + sumofEven);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {

				sumofOdd = arr[i] + sumofOdd;
				System.out.println("Odd numbers: " + arr[i]);

			}

		}

		System.out.println("Sum of Odd numbers " + sumofOdd);

	}

}
