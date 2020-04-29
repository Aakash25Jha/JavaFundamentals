package fundamentals;

import java.util.Scanner;

public class Looping 
{	
	public void whileL(Scanner sc)
	{
		System.out.println("Let's Try making a Factorial Program");
		System.out.println("Enter the number that will be the factorial input");
		int input= sc.nextInt();
		int i=input;
		int Factorial=1;
		while(i>1)
		{
			Factorial *= i--;
//			System.out.println("Factorial of the number"+input+" "+"is"+" "+Factorial);
		}	
		System.out.println("Factorial of the number "+input+" "+"is"+" "+Factorial);
	}
	
	public void DowhileL()
	{
		System.out.println("Let's Try making a Factorial Program");
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number that will be the factorial input");
		int input= sc.nextInt();
		int Factorial=1;
		do 
		{
			System.out.println("The number is"+ " "+ input);
			Factorial *= input--;
		}
		while(input>1);
		System.out.println("Factorial of the number"+input+" "+"is"+" "+Factorial);
		sc.close();
	}
	
	public void forL()
	{
		System.out.println("Let's Try making a Factorial Program");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number that will be the factorial input");
		int input;
		//int input= sc.nextInt();
		int Factorial=1;
		for(input=sc.nextInt();input>1;input--)
		{
			Factorial*=input;
		}
		System.out.println("Factorial of the number"+input+" "+"is"+" "+Factorial);
		sc.close();
	}
	
	public static void main(String[] args) 
	{	
		Scanner sc= new Scanner(System.in);
		Looping lp= new Looping();
		System.out.println("Which loop do you want to use?");
		System.out.println("1)While"+" "+"2)Do While"+" "+"3)For"+" ");
		String response = sc.nextLine();
		
		
		if(response.equalsIgnoreCase("While"))
		{
			lp.whileL(sc);
		}
		else if(response=="Do While")
		{
			lp.DowhileL();
		}
		else if(response=="For")
		{
			lp.forL();
		}
		else
			System.out.println("You haven't chosen the right option");
		sc.close();
	}
}
