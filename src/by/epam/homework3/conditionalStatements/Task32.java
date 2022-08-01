package by.epam.homework3.conditionalStatements;

import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input number a:");
		int a = scan.nextInt();
		System.out.println("input number b:");
		int b = scan.nextInt();
		System.out.println("input number c:");
		int c = scan.nextInt();
		if (a+b>=0 || a+c>=0 || b+c>=0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
