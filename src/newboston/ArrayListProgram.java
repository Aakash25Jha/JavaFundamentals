package newboston;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListProgram {
	public static void main(String args[]) {
		ArrayList<String> pokemonList = new ArrayList<String>();
		ArrayList<String> evolutionList = new ArrayList<String>();
		String[] pokemon = { "eevve", "jolteon", "Flareon", "Vaporeon" };
		String[] evolutions = { "pichu", "pikachu", "raichu", "eevve", "jolteon", "Flareon", "Vaporeon", "squirtle",
				"watortle", "Blastoise" };
		for (String p : pokemon) {
			pokemonList.add(p);
		}
		for (String e : evolutions) {
			evolutionList.add(e);
		}
		for (int i = 0; i < evolutionList.size(); i++) {
			System.out.print(evolutionList.get(i) + " ");
		}

		editlist(evolutionList, pokemonList);
		System.out.println();
		for (int i = 0; i < evolutionList.size(); i++) {
			System.out.print(evolutionList.get(i) + " ");
		}

	}

	public static void editlist(Collection<String> L1, Collection<String> L2) {
		Iterator<String> it = L1.iterator();
		while (it.hasNext()) {
			if (L2.contains(it.next())) {
				it.remove();
			}
		}
	}
}
