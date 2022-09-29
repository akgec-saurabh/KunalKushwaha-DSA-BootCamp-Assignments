package kunalKushwaha_DSA_BootCamp_Java.Functions;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("You are "+vote(age)+" to Vote");
		

	}
	
	public static String vote(int age) {
		if(age>=18) {
			return "Eligible";
		}
		else {
			return "Not Eligible";
		}
	}

}
