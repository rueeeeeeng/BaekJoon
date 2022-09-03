package no6;

import java.util.Scanner;

public class Find_alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for (int i = 0; i < 26; i++) {
			System.out.print(s.indexOf(97+i)+" ");
		}
	}

}
