package by.epam.homework3.conditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task34 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input cost of the books:");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("Input amount:");
		int b = Integer.parseInt(reader.readLine());
		if (a>b) {
			while (a>b) {
			System.out.print("Money involved is way too small, please deposit an additional ");
			System.out.println(a-b);
			b += Integer.parseInt(reader.readLine());
			}
		}
		if (a==b) {
			System.out.println("Thank you!");
			}
		else {
			System.out.print("Thank you! Your change ");
			System.out.println(b-a);
		}
		
	}

}
