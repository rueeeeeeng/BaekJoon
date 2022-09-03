package no4;

import java.util.Scanner;

public class OXQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		String arr[] = new String[cases];
		int score;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			score = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j)=='O') {
					score++;
					sum+=score;
				}
				else {
					score=0;
					sum+=score;
				}
			}
			System.out.println(sum);
		}
		
		
	}
}
