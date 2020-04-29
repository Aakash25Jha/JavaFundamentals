package fundamentals;

import java.util.Scanner;

public class Conditionals 
{
	public static void main(String[] args) {
		System.out.println("Enter your Inputs");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int c=(a<b)?b-a:b+a;
		System.out.println("The value of c is"+c);
	}
}
