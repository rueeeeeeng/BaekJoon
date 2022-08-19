package no2;

import java.util.Scanner;

public class Oven_clock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int needtime = sc.nextInt();
		
		minute+=needtime;
		if(minute>59) {
			hour += (minute/60);
			minute = (minute%60);
			if(hour>23) {
				hour = hour-24;
			}
		}
		
		System.out.println(hour +" "+ minute);
	}
}
