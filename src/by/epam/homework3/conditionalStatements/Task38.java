package by.epam.homework3.conditionalStatements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task38 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input x:");
		int x = Integer.parseInt(reader.readLine());
		double fx;
		if (x>=0&&x<=3) {
			fx = Math.pow(x, 2);
		}
		else {
			fx = 4;
		}
		System.out.println("x = "+x+" | F(x) = "+fx+".");

	}

}
