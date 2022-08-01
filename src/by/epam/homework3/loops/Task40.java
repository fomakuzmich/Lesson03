package by.epam.homework3.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task40 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number:");
		int x = Integer.parseInt(reader.readLine());
		for (int i = 1;i<=x;i++) {
			String s = String.valueOf(i);
			int count = s.length();
			for (int j = 0; j<s.length(); j++) {
				int a = s.charAt(j);
				int b = a -'0';
				if(b>0&&i%b==0) {
					count-=1;
					if (count==0) {
						System.out.println(i);
					}
				}
			}
		}

	}

}
