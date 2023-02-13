package step.bronze.IV;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//1264
public class NumberOfVowel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int num = 0;
		List<String> vowel = Arrays.asList("a","e","i","o","u");
		int i = 0;
		while(str.charAt(i)!='#') {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				num++;
			}
			i++;
		}
		
	}
}
