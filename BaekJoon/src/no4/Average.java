package no4;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		double subject[] = new double[num]; 
		double max = 0;
		double avg=0;
		
		for (int i = 0; i < subject.length; i++) {
			subject[i] = sc.nextInt();
		}
		
		for (int i = 0; i < subject.length; i++) {
			if(max < subject[i]) {
				max = subject[i];
			}
		}
		
		for (int i = 0; i < subject.length; i++) {
			subject[i] = subject[i]/max*100;
			avg+= subject[i];
		}
		avg /=num;
		System.out.println(avg);
	}
}
