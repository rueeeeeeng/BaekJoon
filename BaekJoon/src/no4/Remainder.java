package no4;
//다시 풀어보기

import java.util.ArrayList;
import java.util.Scanner;

public class Remainder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList();
		int remainder[] = new int[10];
		for (int i = 0; i < remainder.length; i++) {
			remainder[i] = sc.nextInt() % 42;
		}
		
		for (int i = 0; i < remainder.length; i++) {
			if(!nums.contains(remainder[i])) {
				nums.add(remainder[i]);
			}
		}
		
		System.out.println(nums.size());
	}

}
