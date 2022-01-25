package no1;

import java.util.Scanner;

public class idcheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String aId = "joonas";
		
		if(id.equals(id)) {
			System.out.println(id+"??!");
		}
	}
}
