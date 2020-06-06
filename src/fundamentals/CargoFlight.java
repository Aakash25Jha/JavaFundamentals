package fundamentals;

public class CargoFlight extends Flight
{
	public int getSeats()
	{
		return 12;
	}
	
	public static void main(String args[])
	{
		Flight f1= new Flight();
		f1.addPassenger();
		System.out.println(f1.getSeats());
		
		Flight f2= new CargoFlight();
		System.out.println(f2.getSeats());
		
		Flight cf= new Flight(); 
		
	}
}
