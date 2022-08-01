package by.epam.homework3.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task22 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input a:");
		int a = Integer.parseInt(reader.readLine());
		System.out.println("Input b:");
		int b = Integer.parseInt(reader.readLine());
		System.out.println("input h:");
		int h = Integer.parseInt(reader.readLine());
		System.out.println("     X     |    F(x)   ");
		System.out.println("-----------------------");
		for (int x=a;x<=b;x+=h) {
			double fx = Math.pow(Math.sin(x), 2);
			System.out.printf("%-11d|", x);
			System.out.printf("%.5f\n", fx);
		}

	}

}
