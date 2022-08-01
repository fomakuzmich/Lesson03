package by.epam.homework3.loops;

public class Task05 {

	public static void main(String[] args) {
		int start = 1;
		int stop = 99;
		int sum = 0;
		while (start<=stop) {
			sum+=start;
			start+=2;
		}
		System.out.println(sum);

	}

}
