package kunalKushwaha_DSA_BootCamp_Java.Functions;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Factorial is "+factorial(num));

	}
	public static int factorial(int num) {
		if(num==1 || num==0) {
			return 1;
		}
		return num*factorial(num-1);
	}
	

}
