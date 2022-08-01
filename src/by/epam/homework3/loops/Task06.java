package by.epam.homework3.loops;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a positive number:");
		int x = scan.nextInt();
		for(int i=1;i<=x;i++) {
			System.out.println(i);
		}

	}

}
