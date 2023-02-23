package org.easyquestions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1, num2, total;
		int prompt;
		System.out.print(
				"\n1. Press 1 for Addition \n2. Press 2 for Subtraction \n3. Press 3 for Division  \n4. Press 4 for Multiply\n5. Press 0 for Exit\n-----------------------\n");
		System.out.print("Choose your option: ");
		prompt = sc.nextInt();

		if (prompt == 1) {
			System.out.println("You selected 1 for Addition");
		} else if (prompt == 2) {
			System.out.println("You selected 2 for Subtraction");
		} else if (prompt == 3) {
			System.out.println("You selected 3 for Division");
		} else if (prompt == 4) {
			System.out.println("You selected 4 for Multiply");
		}

		System.out.print("Enter first number: ");
		num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		num2 = sc.nextInt();
		sc.close();

		switch (prompt) {
		case 1:
			total = (num1 + num2);
			System.out.println(total);
			break;
		case 2:
			total = (num1 - num2);
			System.out.println(total);
			break;
		case 3:
			total = (num1 / num2);
			System.out.println(total);
			break;
		case 4:
			total = (num1 * num2);
			System.out.println(total);
			break;

		default:
			System.out.println("Wrong Input!");

		}
	}

}
