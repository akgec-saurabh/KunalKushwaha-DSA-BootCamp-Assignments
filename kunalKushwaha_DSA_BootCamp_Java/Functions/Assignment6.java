package kunalKushwaha_DSA_BootCamp_Java.Functions;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
	
		
		System.out.println("The Circle area is : "+area(r)+ " and the circumference is "+circumference(r));

	}
	
	public static int area(int r) {
		return (int) (Math.PI*r*r);
	}
	
	public static int circumference(int r) {
		return  (int) (2*Math.PI*r);
	}

	

}
