package no6;
//아직 다 안 풀었음
import java.util.Scanner;

public class GroupWordChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int cnt = 0; //최종 그룹단어의 개수
		String[] words = new String[number];
		
		for (int i = 0; i < words.length; i++) {
			words[i] = sc.next();
		}
		
		for (int i = 0; i < number; i++) {
			System.out.println(words[i].charAt(1));
			int a = words[i].charAt(1);
			System.out.println(a);
//			for (int j = 0; j < words[i].length()-1; j++) {
//				if(words[i].charAt(j)!=words[i].charAt(j+1)) {
//					
//				}
//			}
		}
		
	}

}
