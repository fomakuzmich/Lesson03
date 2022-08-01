package by.epam.homework3.conditionalStatements;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number of chamomile petals:");
		int x = scan.nextInt();
		if (x%2==0) {
			System.out.println("Not Love");
		}
		else {
			System.out.println("Love");
		}

	}

}
