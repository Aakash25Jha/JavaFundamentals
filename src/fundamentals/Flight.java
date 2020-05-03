package fundamentals;

public class Flight {
private int passengers;
private int seats;
public Flight()
{
	passengers=150;
	seats=0;
}

void addPasseneger()
{
	if(passengers<seats)
	{
		passengers+=1;
	}
	else
		tooMany();
}
void tooMany()
{
System.out.println("Too many paasengers for limited number of seats");	
}
}
