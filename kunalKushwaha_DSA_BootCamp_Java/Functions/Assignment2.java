package kunalKushwaha_DSA_BootCamp_Java.Functions;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The Number is "+type(num));

	}
	
	public static String type(int num) {
		if(num%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
	}

}
