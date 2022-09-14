package basic_math1;

import java.util.Scanner;

//손익분기점
public class Break_even_point {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(); //고정비용
		int B = sc.nextInt(); //가변비용
		int C = sc.nextInt(); //가격
		
		int result = 0;
		
		if(C-B<=0) {
			result = -1;
		}
		else {
			result = A/(C-B)+1;
		}
		
		System.out.println(result);
	}
}
