package step.bronze.V;

import java.util.Scanner;

public class Ah {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String Jaehwan = sc.next();
		String doctor = sc.next();
		
		if(Jaehwan.length()>=doctor.length()) {
			System.out.println("go");
		}
		else {
			System.out.println("no");
		}
		
	}

}
