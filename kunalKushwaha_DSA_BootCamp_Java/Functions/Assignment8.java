package kunalKushwaha_DSA_BootCamp_Java.Functions;

import java.util.Scanner;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks=sc.nextInt();
		System.out.println("Your grade for the current mark is "+grade(marks));

	}
	
	public static String grade(int marks) {
		if(marks>90) {
			return "AA";
		}
		else if(marks>80) {
			return "AB";
		}
		else if(marks>70) {
			return "BB";
		}
		else if(marks>60) {
			return "BC";
		}
		else if(marks>50) {
			return "CD";
		}
		else if(marks>40) {
			return "DD";
		}
		else {
			return "Fail";
		}
	}

}
