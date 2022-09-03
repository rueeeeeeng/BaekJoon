package no5;
//다시 풀어보기

import java.util.Scanner;

public class Hansu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int n = hansu(num);
		
		System.out.println(n);
	}

	private static int hansu(int num) {
		int count = 0;
		if(num<100) count=num;
		else {
			count+=99;
			for (int i = 100; i <=num; i++) {
				if((i%10+i/100)==(i/10%10*2)) {
					count++;
				}
			}
		}
		return count;
	}
}
