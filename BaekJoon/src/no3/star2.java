package no3;

import java.util.Scanner;

public class star2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) { //행
			for (int j = 1; j < num-i; j++) { //공백
				System.out.print(" ");
			} 
			for (int k = 0; k <=i; k++) { //별
				System.out.print("*");
			}
			System.out.println();
		}
	}
}