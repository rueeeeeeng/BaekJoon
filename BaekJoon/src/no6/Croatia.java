package no6;
//다시 풀어보기
import java.util.Scanner;

public class Croatia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] alphabet = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		String word = sc.nextLine();
		int sum = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if(word.contains(alphabet[i])) {
				word = word.replace(alphabet[i], "!");
			}
		}
		System.out.println(word.length());

	}

}
