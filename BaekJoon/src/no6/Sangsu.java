package no6;

import java.util.Scanner;

public class Sangsu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		A =Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B =Integer.parseInt(new StringBuilder().append(B).reverse().toString());
	
		System.out.println(A>B?A:B);
	}

}
