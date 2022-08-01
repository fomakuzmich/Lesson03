package by.epam.homework3.conditionalStatements;

import java.util.Scanner;

public class Task35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number of day:");
		int x = scan.nextInt();
		int count = 0;
		if (x<=0 || x>365) {
			System.out.println("Input error!");
			x = scan.nextInt();
		}
		if (x<=31) {
			System.out.println(x + " January");
		}
			count+=31;
		if (x-count<=28 && x>count) {
			System.out.println(x-count + " February");
		}
			count+=28;
		if (x-count<=31 && x>count) {
			System.out.println(x-count + " March");
		}
			count+=31;
		if (x-count<=30 && x>count) {
			System.out.println(x-count + " April");
		}
			count+=30;
		if (x-count<=31 && x>count) {
			System.out.println(x-count + " May");
		}
			count+=31;
		if (x-count<=30 && x>count) {
			System.out.println(x-count + " June");
		}
			count+=30;
		if (x-count<=31 && x>count) {
			System.out.println(x-count + " July");
		}
			count+=31;
		if (x-count<=31 && x>count) {
			System.out.println(x-count + " August");
		}
			count+=31;
		if (x-count<=30 && x>count) {
			System.out.println(x-count + " September");
		}
			count+=30;
		if (x-count<=31 && x>count) {
			System.out.println(x-count + " October");
		}
			count+=31;
		if (x-count<=30 && x>count) {
			System.out.println(x-count + " November");
		}
			count+=30;
		if (x-count<=31 && x>count) {
			System.out.println(x-count + " December");
		}
			count+=31;
		
		

	}

}
