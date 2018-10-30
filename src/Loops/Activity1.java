package Loops;

import java.util.Scanner;

public class Activity1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int largest = 0;
		int number = 0;
		do {
			if (number > largest)
				largest = number;
			System.out.println("Enter a number(9999 to quit):");
			number = input.nextInt();
		} while (number != 9999);
		System.out.println("The Largest Number Is: " + largest);

	}

}
