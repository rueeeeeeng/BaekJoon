package no4;

import java.util.Scanner;

public class MaxOrMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		min = max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(min>arr[i])
				min = arr[i];
			if(max<arr[i])
				max = arr[i];
		}
		
		System.out.println(min + " " + max);
	}

}
