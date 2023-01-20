package basic_math1;

import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();	//낮에 올라가는 높이
		int B = sc.nextInt();	//밤에 내려가는 높이
		int V = sc.nextInt();	//나무 막대의 높이
		
		int height= 0;
		int cnt = 0;
		
		while(height!=V) {
			height += A;
			if(height!=V) {
				height -= B;
				cnt++;
			}
			else {
				break;
			}
			
		}
		
		System.out.println(cnt);
	}

}
