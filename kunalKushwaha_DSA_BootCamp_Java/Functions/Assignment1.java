package kunalKushwaha_DSA_BootCamp_Java.Functions;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Largest Number is : "+largest(a,b,c));
		System.out.println("Smallest Number is : "+smallest(a,b,c));
		
		
	}
	
	public static int largest(int a,int b,int c) {
		if(a>b) {
			if(a>c) {
				return a;
			}
			else {
				return c;
				
			}
		}
		else {
			if(b>c){
			return b;
			}
			else {
				return c;
				
			
		}
			
		}
	}
	
	public static int smallest(int a, int b ,int c) {
		if(a>b) {
			if(c>b) {
				return b;
			}
			else {
				return c;
			}
		}
		else {
			if(c>a) {
				return a;
			}
			else {
				return c;
			}
		}
	}

}
