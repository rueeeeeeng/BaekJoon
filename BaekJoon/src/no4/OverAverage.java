package no4;
//다시 풀어보기

import java.util.Scanner;

public class OverAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt(); //줄 수
		int scores[];
		
		for (int i = 0; i < cases; i++) {
			double sum = 0;
			int studentNum = sc.nextInt(); //학생 수
			scores = new int[studentNum];
			
			for (int j = 0; j < studentNum; j++) {
				scores[j] = sc.nextInt();
				sum += scores[j];
			}
			
			double avg = sum/studentNum;
			double count = 0; //평균이 넘는 학생의 수
			
			for (int j = 0; j <studentNum; j++) {
				if(scores[j]>avg) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/studentNum)*100);
		}
		
	}
}
