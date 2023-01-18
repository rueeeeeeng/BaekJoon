package no4;

import java.util.ArrayList;
import java.util.Scanner;

public class NoHomework {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> goodStudents = new ArrayList<Integer>();
		
		for (int i = 0; i < 28; i++) {
			goodStudents.add(sc.nextInt());
		}
		
		ArrayList<Integer> allStudents = new ArrayList<Integer>();
		for (int i = 1; i <= 30; i++) {
			allStudents.add(i);
		}
		for (int i = 0; i < 28; i++) {
			allStudents.remove(goodStudents.get(i));
		} 
		
		for (int i = 0; i < allStudents.size(); i++) {
			System.out.println(allStudents.get(i));
		}
	}

}
