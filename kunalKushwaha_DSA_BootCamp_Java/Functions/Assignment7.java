package kunalKushwaha_DSA_BootCamp_Java.Functions;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The number is "+prime(num)+" prime");
	

	}
	public static boolean prime(int num) {
		if(num<=1) {
			return false; 
		}
		for(int i=2;i<num;i++) {
			if(num % i==0) return false;
		}
		return true;
	}

}
