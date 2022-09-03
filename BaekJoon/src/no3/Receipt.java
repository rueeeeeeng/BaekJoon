package no3;

import java.util.Scanner;

public class Receipt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		int all_price = sc.nextInt();
		int kindOf  = sc.nextInt();
		for (int i = 0; i < kindOf; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			
			sum += price*num;
		}
		
		if(sum==all_price)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
