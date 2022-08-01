package by.epam.homework3.loops;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a:");
		int y;
		int a = scan.nextInt();
		System.out.println("Input b:");
		int b = scan.nextInt();
		System.out.println("Input h:");
		int h = scan.nextInt();
		System.out.println("    X      |     Y     ");
		System.out.println("-----------------------");
		while (a<=b) {
			if (a>2) {
				y = a;
			}
			else {
				y = -a;
			}
			System.out.printf("%-11d|%-11d\n",a,y);
			a+=h;
		}

	}

}
