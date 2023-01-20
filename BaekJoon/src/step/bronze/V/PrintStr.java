package step.bronze.V;

import java.util.Scanner;

public class PrintStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		String[] strs = new String[testCase];
		
		for (int i = 0; i < strs.length; i++) {
			strs[i]=sc.next();
		}
		
		for (int i = 0; i < testCase; i++) {
			String firstIndex = strs[i].substring(0,1);
			String lastIndex = strs[i].substring(strs[i].length()-1);
			System.out.print(firstIndex);
			System.out.print(lastIndex);
			System.out.println();
		}
		
		
	}
}
