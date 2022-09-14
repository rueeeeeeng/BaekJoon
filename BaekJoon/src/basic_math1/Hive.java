package basic_math1;

import java.util.Scanner;

//벌집

public class Hive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int range = 2;
		int count = 0;
		if(N==1) {
			count = 1;
		}
		else {
			while(range<=N) {
				range = range+(6*count);
				count++;
			}
		}
		System.out.println(count);
	}
}
