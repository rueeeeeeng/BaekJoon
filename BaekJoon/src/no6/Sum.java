package no6;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String numbers = sc.next();
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			int reNum = (int)numbers.charAt(i)-48;
			sum+=reNum;
			
		}
		
		System.out.println(sum);
	}

}
