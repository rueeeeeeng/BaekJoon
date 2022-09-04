package no6;
//다시 풀어보기
import java.util.Scanner;

public class Study_voca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int arr[] = new int[26];
		int max = 0;
		char ch = ' ';
		for (int i = 0; i < word.length(); i++) {
			if('A'<=word.charAt(i)&&word.charAt(i)<='Z') {
				arr[word.charAt(i)-'A']++;
			}
			else if('a'<=word.charAt(i)&&word.charAt(i)<='z') {
				arr[word.charAt(i)-'a']++;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			if(arr[i]>max) {
				max=arr[i];
				ch = (char)(i+65);
			}
			else if(arr[i]==max)
				ch='?';
		}
		
		System.out.println(ch);
		
	}

}
