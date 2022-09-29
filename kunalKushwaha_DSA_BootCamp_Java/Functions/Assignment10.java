package kunalKushwaha_DSA_BootCamp_Java.Functions;

import java.util.Scanner;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(palindrome(num)==num) {
			System.out.println("yes");
			
			
		}
		else {
			System.out.println("No");
		}
		

	}
	public static int palindrome(int num) {
		int reverse=0;
		while(num>0) {
			reverse+=num%10;
			
			num/=10;
			if(num>0)reverse*=10;
			
		}
		return reverse;
	}

}
