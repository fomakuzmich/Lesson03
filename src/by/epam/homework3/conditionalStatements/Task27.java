package by.epam.homework3.conditionalStatements;

public class Task27 {

	public static void main(String[] args) {
		int a = 12;
		int b = 34;
		int c = 56;
		int d = 78;
		int minab, mincd, max;
		if (a<b) {
			minab = a;
		}
		else {
			minab = b;
		}
		if (c<d) {
			mincd = c;
		}
		else {
			mincd = d;
		}
		if (minab>mincd) {
			max = minab;
		}
		else {
			max = mincd;
		}
		System.out.println(max);
	}

}
