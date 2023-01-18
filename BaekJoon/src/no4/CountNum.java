package no4;

import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numbers = sc.nextInt(); // 정수의 개수
		int num[] = new int[numbers]; // 정수 배열
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		int findNum = sc.nextInt(); //찾으려고 하는 정수 v
		int count = 0; // 정수 배열 중에 정수 v의 개수
		
		for (int i = 0; i < num.length; i++) {
			if(findNum == num[i]) {
				count++;
			}
		}
		System.out.println(count);
	}

}
