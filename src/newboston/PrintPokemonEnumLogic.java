package newboston;

public class PrintPokemonEnumLogic {

	public static void main(String[] args) {
		System.out.println("Name" + "\t\t" + "Number" + "\t\t" + "Name");
		for (EnumLogic el : EnumLogic.values()) {
			System.out.println(el + "\t" + el.getNum() + "\t" + el.getName());
		}
	}
}
