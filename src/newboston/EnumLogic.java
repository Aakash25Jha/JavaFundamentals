package newboston;

public enum EnumLogic {
	
	 starter1("#001","Bulbasaur"),
	 starter2("#002","Charmander"),
	 starter3("#003","Squirtle"),
	 starter4("#000","Pikachu");
	 
	private final String num;
	private final String name;
	 
	 
	 EnumLogic(String Number,String Name)
	 {
		 num=Number;
		 name=Name;
	 }
	 public String getNum() {
		 return num;
	 }
	 public String getName() {
		 return name;
	 }
}
