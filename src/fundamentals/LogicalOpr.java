package fundamentals;

public class LogicalOpr 
{
	static int  students= 300;
	static int rooms= 0;
	
	public static void main(String[] args) {
		
		if(rooms>0 && students/rooms>10)
		{
			System.out.println("Crowded");
		}
		else
			System.out.println("Room not available");
	}
}
