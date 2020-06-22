package fundamentals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import org.apache.logging.log4j.Logger;



public class PokemonFile {
	
    
	public static void checkfileExistence()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the file you want to check");
		String location=sc.nextLine();
		File file= new File(location);
		if(file.exists())
			readfile(file);
		else
			System.out.println("Please enter a correct file location");
	}
	
	public static void readfile(File file) {
		BufferedReader br = null;
		int total = 0;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				total++;
			}
			System.out.println("The total number of pokemons are:" +" "+ total);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.getMessage();
				}
		}
	}

	public static void main(String args[]) {
		checkfileExistence();
	}
}