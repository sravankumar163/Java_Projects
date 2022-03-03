package com.simplilearn.arithmeticcalculator;

import java.util.Scanner;

public class simpleCalculatot {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("welcome to simple calculatot");
			int status;
			do {
				System.out.println("Press 1 for addition");
				System.out.println("Press 2 for subtraction");
				System.out.println("Press 3 for multiplication");
				System.out.println("Press 4 for division with cofficent result");
				System.out.println("Press 5 for division with reminder result");
				System.out.println("Enter your choice");
				int choice = sc.nextInt();
				System.out.println("Enter 1st number");
				int a = sc.nextInt();
				System.out.println("Enter 2nd number");
				int b = sc.nextInt();
				switch (choice) {
				case 1://Addition
					System.out.println("addition of" + a + "and" + b + "is :" + (a + b));
					break;
				case 2://Subtraction
					System.out.println("subtraction of" + a + "and" + b + "is :" + (a - b));
					break;
				case 3://Multiplication
					System.out.println("muitiplication of" + a + "and" + b + "is :" + (a * b));
					break;
				case 4://Division cifficent
					System.out.println("division of" + a + "and" + b + "is cofficent :" + (a / b));
					break;
				case 5://Division reminder
					System.out.println("addition of" + a + "and" + b + "is reminder :" + (a % b));
					break;
				default:
					System.out.println("invalid choice");
				}

				System.out.println("Press 1 to continue");
				System.out.println("Press 2 to Stop");
				status = sc.nextInt();
			} while (status == 1);
		}
		System.out.println("Thank you visit us again");

	}

}
