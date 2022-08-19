package no1;

import java.util.Scanner;

//체스는 총 16개의 피스를 사용하며, 
//킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
//동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 
//몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
public class Chess {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int all_piece[] = {1, 1, 2, 2, 2, 8};
		int piece[] = new int[6];
		for (int i = 0; i < piece.length; i++) {
			piece[i]=sc.nextInt();
		}
		
		for (int j = 0; j < piece.length; j++) {
			System.out.print(all_piece[j]-piece[j] + " ");
		}
	}
	
}
