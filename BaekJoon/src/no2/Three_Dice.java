package no2;

import java.util.Scanner;

public class Three_Dice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dices[] = new int[3];
		for (int i = 0; i < dices.length; i++) {
			dices[i] = sc.nextInt();
		}
		
		int first = dices[0];
		int second = dices[1];
		int third = dices[2];
		int max=0;
		if(first==second) {
			if(second==third && first == third) {
				System.out.println(10000+first*1000);
			}
			else if(second!=third || first!=third){
				System.out.println(1000+first*100);
			}
			
		}
		else { //first!=second
			if(second==third || first == third) {
				System.out.println(1000+third*100);
			}
			else {
				for (int i = 0; i < dices.length; i++) {
					if(max<dices[i])
						max=dices[i];
				}
				System.out.println(max*100);
			}
		}
		
		
	}
}
