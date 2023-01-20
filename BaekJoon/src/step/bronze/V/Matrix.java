package step.bronze.V;
//2738번
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//행렬의 크기
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int A[][] = new int[N][M];
		int B[][] = new int[N][M];
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B.length; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				System.out.print(A[i][j] + B[i][j]);
				if(j!=M-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
