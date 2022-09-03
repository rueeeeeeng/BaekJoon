package no6;

import java.util.Scanner;

public class String_repetition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		
		for (int i = 0; i < cases; i++) {
			int number = sc.nextInt();
			String s = sc.next();
			
			for (int j = 0; j < s.length(); j++) {
				for (int j2 = 0; j2 < number; j2++) {
					System.out.print(s.charAt(j));
				}
				
			}
			System.out.println();
		}
		
	}

}
