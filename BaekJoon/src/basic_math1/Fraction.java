package basic_math1;

import java.util.Scanner;

//분수찾기

public class Fraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int cross_count = 1; //현재 대각선의 원소 개수
		int prev_cross_sum = 0; //1부터 T-1대각선까지의 원소 개수
		
		while(true) {
			if(X<=cross_count+prev_cross_sum) {
				if(cross_count%2==1) {
					System.out.println((cross_count-(X-prev_cross_sum-1))+"/"+(X-prev_cross_sum));
					break;
				}
				else {
					System.out.println((X-prev_cross_sum)+"/"+(cross_count-(X-prev_cross_sum-1)));
					break;
				}
			}
			else {
				prev_cross_sum+=cross_count;
				cross_count++;
			}
		}
		
		
	}

}
