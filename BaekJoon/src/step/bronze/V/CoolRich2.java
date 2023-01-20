package step.bronze.V;

import java.math.BigInteger;
import java.util.Scanner;

public class CoolRich2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();	//최백준 조교가 가진 돈
		BigInteger m = sc.nextBigInteger();	//돈을 받으러 온 생명체의 수
		
		
		System.out.println(n.divide(m));	//몫
		System.out.println(n.mod(m));		//나머지
		
	}
}
