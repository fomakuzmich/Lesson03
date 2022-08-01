package by.epam.homework3.loops;

import java.util.Scanner;

public class Task08 {

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
			if (a==15) {
				y = (a+b)*2;
			}
			else {
				y = (a-b)+6;
			}
			System.out.printf("%-11d|%-11d\n",a,y);
			a+=h;
		}


	}

}
