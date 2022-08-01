package by.epam.homework3.conditionalStatements;

public class Task25 {

	public static void main(String[] args) {
		double t;     
		do {
		t = Math.random()*65;
		if (t>60) {
			System.out.println("Warning! Fire situation!");
		}
		else {
			System.out.println("All OK");
		}
		}
		while (t<=60);

	}

}
