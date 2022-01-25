package no4;
//다시 풀어보기
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int number=num;
		int index=0;
		while(true) {
			number = ((number%10)*10)+(((number/10)+(number%10))%10);
			index++;
			if(num==number)break;
			
		}
		System.out.println(index);
	}
}
