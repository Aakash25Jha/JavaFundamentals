package fundamentals;
import java.util.Scanner;
public class IFElseIF 
{
	public int Greatest(int a,int b,int c)
	{
		int x=a;
		int y=b;
		int z=c;
		
		if(x>y && x>z)
		{
			return x;
		}
		
		else if(y>x && y>z)
		{
			return y;
		}
		
		else
			return z;
		}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		IFElseIF i= new IFElseIF();
		int g=i.Greatest(sc.nextInt(),sc.nextInt(),sc.nextInt());
		 System.out.println("Greatest of three numbers is"+ " "+ g);
	}
}
