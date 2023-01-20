package basic_math1;

import java.util.Scanner;

public class Women_President {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int APT[][] = new int[15][15];
		
		for (int i = 0; i < 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}
		for (int i = 1; i < APT.length; i++) {
			for (int j = 2; j < APT.length; j++) {
				APT[i][j]=APT[i][j-1]+APT[i-1][j];
			}
		}
		
		int T = sc.nextInt();	//Test case의 수
		
		for (int i = 0; i < T; i++) {
			int k = sc.nextInt();	//층
			int n = sc.nextInt();	//호
			System.out.println(APT[k][n]);
		}
	}

}
 