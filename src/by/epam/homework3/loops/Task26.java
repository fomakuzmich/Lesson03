package by.epam.homework3.loops;

public class Task26 {

	public static void main(String[] args) {
		
		for(int i = 33; i<=127;i++){
			char b = (char)i;
			System.out.printf("%5d|", i);
			System.out.println(b+"   |");
			System.out.println("-----------");
		}
	}

}
