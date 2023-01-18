package no6;
//again
import java.util.Scanner;

public class GroupWordChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int cnt = 0; //최종 그룹단어의 개수
		
		for (int i = 0; i < number; i++) {
			String words = sc.next();
			boolean check[] = new boolean[26]; //
			boolean tmp = true; //그룹단어인지 판별
			for (int j = 0; j < words.length(); j++) {
				int index = words.charAt(j)-'a';
				
				if(check[index]) { //이전에 사용한 적 있는 문자일 때
					if(words.charAt(j)!=words.charAt(j-1)) { //이전 문자와 일치하지 않을 때
						tmp = false;
						break;
					}
				}else { //이전에 사용한 적 없는 문자일 때
					check[index] = true;
				}
			}
			if(tmp) cnt++;
			
		}
		System.out.println(cnt);
		
	}

}
