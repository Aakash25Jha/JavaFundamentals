package newboston;

public class CommonStringMethods {

	public static void main(String[] args) {
		
	
	String[] words= {"funk","chunk","furry","bacanator"};
	startsWith(words);
	System.out.println("\t\t\t\t\t\t");
	endsWith(words);
	System.out.println("\t\t\t\t\t\t");
	indexOfString();

}
	public static void startsWith(String[] str)
	{	
		
		for(String s:str)
		{
			if(s.startsWith("fu"))
			{	
				s=s.toUpperCase();
				System.out.println(s+" "+"Starts with fu");
		}
			}
	}
	public static void endsWith(String[] str)
	{	
		
		for(String s:str)
		{
			if(s.endsWith("nk"))
				System.out.println(s+" "+"ends with nk");
		}
	}
	
	public static void indexOfString()
	{	
		String s="     a quick brown fox jumps over a lazy dog";
		System.out.println(s.indexOf("j"));
		System.out.println(s);
		System.out.println("Trimming the space cause why not");
		System.out.println(s.trim());
	}
}