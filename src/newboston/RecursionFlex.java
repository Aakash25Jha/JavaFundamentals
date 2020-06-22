package newboston;

import java.util.Scanner;

public class RecursionFlex {
	
public static void main(String args[]) {
	try {
	System.out.println(fact(5));
	/**
	 * Not Working
	 * 
	 * Scanner input=new Scanner(System.in);
	 * System.out.println(fact(input.nextInt())); input.close();
	 */}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}

public static long fact(long n)
{	
	if(n<=1)
		return 1;
	else
		return n * fact(n-1);
	}
}
