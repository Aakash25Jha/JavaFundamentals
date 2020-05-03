package fundamentals;

import java.util.Scanner;

public class ParamImmutable 
{
	private int Number;

	public int getNumber() {
		return Number;
	}

	public void setNumber(int Number) {
		this.Number = Number;
	}
	
	public ParamImmutable()
	{
		
	}
	public ParamImmutable(int i)
	{
		Number=i;
	}
	public void swap(ParamImmutable pi1, ParamImmutable pi2)
	{
		int pi3;
		pi3=pi1.getNumber();
		pi1.setNumber(pi2.getNumber());
		pi2.setNumber(pi3);
	}
	public void swapWrong(ParamImmutable pi1, ParamImmutable pi2)
	{
		ParamImmutable pi3;
		pi3=pi1;
		pi1=pi2;
		pi2=pi3;
		System.out.println(pi1.getNumber()+" "+pi2.getNumber());
	}
	public static void main(String args[])
	{	
		System.out.println("Enter values to be swapped");
		Scanner sc= new Scanner(System.in);
		System.out.print("Value 1=");
		ParamImmutable val1 = new ParamImmutable(sc.nextInt());
		System.out.print("Value 2=");
		ParamImmutable val2 = new ParamImmutable(sc.nextInt());
		ParamImmutable obj = new ParamImmutable();
		//obj.swap(val1,val2);
		obj.swapWrong(val1, val2);
		System.out.println("The swapped values are");
		System.out.println("Value 1="+val1.getNumber()+" "+" Value 2="+val2.getNumber());
	}
}
