package fundamentals;

public class Flight {
private int passengers;
private int seats;
private int totalCheckedBags;

public Flight()
{	
	totalCheckedBags=0;
	passengers=0;
	seats=150;
}
public int getSeats()
{
	return 150;
}

public void addPassenger()
{
	if(hasSeating())
		passengers+=1;
	else
		tooMany();
}
public void addPassenger(int bags)
{
if(hasSeating())
{
	addPassenger();
	totalCheckedBags += bags;
}
}
public void tooMany()
{
System.out.println("Too many paasengers for limited number of seats");	
}

private boolean hasSeating()
{
	return passengers<getSeats();
}
}
