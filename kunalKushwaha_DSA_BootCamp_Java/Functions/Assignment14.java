package kunalKushwaha_DSA_BootCamp_Java.Functions;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The sum is "+sum(n));

	}
	
	public static int sum(int n) {
		int sum=0;
		int i=1;
		while(i<=n) {
			sum+=i;
			
			i++;
		}
		return sum;
	}

}
