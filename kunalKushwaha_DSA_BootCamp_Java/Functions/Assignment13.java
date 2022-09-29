package kunalKushwaha_DSA_BootCamp_Java.Functions;

import java.util.Scanner;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int lowerLimit = sc.nextInt();
		int upperLimit = sc.nextInt();
		sum(lowerLimit,upperLimit);
		
	}
	
	public static void sum(int l,int u) {
		int sum=0;
		for(int i=l;i<=u;i++) {
			if(prime(i)) {
			System.out.print(i +" ");
				
			}
			
			
		}
		
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
