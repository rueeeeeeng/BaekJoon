package basic_math1;

import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();
		
		System.out.println(A.add(B));
	}

}
