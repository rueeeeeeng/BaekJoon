package no3;

import java.util.Scanner;

public class Main {
	
}

/*
 * 1. 구구단 Scanner sc = new Scanner(System.in); int num = sc.nextInt(); for (int
 * i = 1; i <= 9; i++) { System.out.println(num+" * "+i+" = "+num*i); }
 * 
 * 2.a+b-3 Scanner sc = new Scanner(System.in); int num = sc.nextInt();
 * 
 * int[] arr = new int[num];
 * 
 * for (int i = 0; i < num; i++) { int A = sc.nextInt(); int B = sc.nextInt();
 * 
 * arr[i]=A+B; }
 * 
 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
 * 
 * 3. 합 Scanner sc = new Scanner(System.in); int n = sc.nextInt(); int sum=0;
 * for (int i = 1; i <= n; i++) { sum+=i; } System.out.println(sum);
 * 
 * 4. 빠른 A+B Scanner sc = new Scanner(System.in); BufferedReader br = new
 * BufferedReader(new InputStreamReader(System.in)); BufferedWriter bw = new
 * BufferedWriter(new OutputStreamWriter(System.out));
 * 
 * StringTokenizer st; int num; try { num = Integer.parseInt(br.readLine());
 * 
 * 
 * for (int i = 0; i < num; i++) { st = new StringTokenizer(br.readLine()," ");
 * bw.write((Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken())
 * )+"\n"); } bw.flush(); br.close(); bw.close(); } catch (NumberFormatException
 * e) { // TODO Auto-generated catch block e.printStackTrace(); } catch
 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
 * 
 * 
 * 5. N 찍기 Scanner sc = new Scanner(System.in); int num = sc.nextInt();
 * 
 * for (int i = 1; i <= num; i++) { System.out.println(i); }
 * 
 * 6. 기찍 N Scanner sc = new Scanner(System.in); int num = sc.nextInt();
 * 
 * for (int i = num; i >= 1; i--) { System.out.println(i); }
 * 
 * 7. A+B-7
 * 
 * 
 * 8. A+B -8 Scanner sc = new Scanner(System.in); int num = sc.nextInt(); for
 * (int i = 1; i <= num; i++) { int A = sc.nextInt(); int B = sc.nextInt();
 * System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A + B));
 * 
 * }
 * 
 * 9. 별찍기 -1 import java.util.Scanner;
 * 
 * public class Main { public static void main(String[] args) { Scanner sc = new
 * Scanner(System.in); int num = sc.nextInt();
 * 
 * for (int i = 1; i <=num; i++) { for (int j = 1; j <= i; j++) {
 * System.out.print("*"); } System.out.println(" "); } } }
 * 
 * 10. 별찍기 -2
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
