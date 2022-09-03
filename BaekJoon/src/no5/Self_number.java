package no5;
//다시 풀어보기
public class Self_number {
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i <= 10000; i++) {
			int n = d(i);
			if(n<10001) {
				check[n] = true;
			}
		}
		
		for (int i = 1; i < check.length; i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
		
	}

	private static int d(int number) {
		int sum = number;
		
		while(number!=0){
			sum+=number%10;
			number/=10;
		}
		
		return sum;
	}
}
