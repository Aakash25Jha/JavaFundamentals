package fundamentals;

import java.util.Scanner;

public class StringEquality {
	public StringEquality() {
	}

	public StringEquality(String a, String b) {
		if (a == b) {
			System.out.println("== Method works");
		} else if (intern(a, b)) {
			System.out.println("Intern method works");
		}
		else 
			System.out.println("Nai chal raha re");
	}

	private boolean intern(String a, String b) {
		String x = a.intern();
		String y = b.intern();
		if (x == y)
			return true;
		else
			return false;
	}

	public static void main(String args[])
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the two strings to be compared");
			StringEquality se= new StringEquality(sc.next(),sc.next());
		}
}
