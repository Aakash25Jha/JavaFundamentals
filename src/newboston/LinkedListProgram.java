package newboston;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListProgram 
{	
	public static void main(String[] args) {
	String[] pokemon = { "eevve", "jolteon", "Flareon", "Vaporeon" };
	String[] evolutions = { "pichu", "pikachu", "raichu","squirtle","watortle", "Blastoise" };
	List<String> pokemonList = new LinkedList<String>();
	List<String> evolutionList = new LinkedList<String>();
	 for(String e: evolutions)
	 {
		 evolutionList.add(e);
	 }
	 for(String p:pokemon)
	 {
		 pokemonList.add(p);
	 }
	 evolutionList.addAll(pokemonList);
	 pokemonList=null;
	 
	 printMe(evolutionList);
	 removeStuff(evolutionList,2,5);
	 printMe(evolutionList);
	 reverseMe(evolutionList);
}
	//printMe
	private static void printMe(List<String> l) {
		for(String b:l)
			System.out.print(b+" ");
	System.out.println();
	}
	private static void removeStuff(List<String> l,int from,int to)
	{
		l.subList(from, to).clear();
	}
	private static void reverseMe(List<String> l) {
		ListIterator<String> lol =l.listIterator(l.size());
		while(lol.hasPrevious())
		{
			System.out.print(lol.previous()+" ");
		}
	}
}