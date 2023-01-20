package step.bronze.V;

import java.util.Scanner;

public class CalcGrade {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade = sc.next();
		double score = 0;
		char[] str=grade.toCharArray();
		if(str[0] == 'F') {
			score = 0.0;
		}
		else {
			
			
			if(str[0]=='A')
				score = 4.0;
			else if(str[0]=='B')
				score = 3.0;
			else if(str[0]=='C')
				score = 2.0;
			else if(str[0]=='D')
				score = 1.0;
			
			if(str[1]=='+')
				score+=0.3;
			else if(str[1]=='0')
				score+=0.0;
			else if(str[1]=='-')
				score-=0.3;
		}
		
		System.out.println(score);
	}

}
