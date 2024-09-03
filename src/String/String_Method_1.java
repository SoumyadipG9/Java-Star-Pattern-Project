package String;

public class String_Method_1 {

	public static void main(String[] args) {
		
		String name="     SOUMyadip     ";
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		
		System.out.println("********************************");
		
		System.out.println("Carpet".startsWith("Car"));
		System.out.println("Carpet".startsWith("Rat"));
		System.out.println("Carpet".endsWith("pet"));
		System.out.println("Island".equals("Island"));
		System.out.println("Goal".charAt(2));
		
		System.out.println("********************************");
		
		char eat= "Carpet".charAt(4);
		System.out.println(eat);
		
		System.out.println("********************************");
		
		int age=44;
		String goal=String.valueOf(age);
		
		System.out.println(age+4);     //48
		System.out.println(goal+4);  //444
		
		System.out.println("********************************");
		
		String sentences="I Love, Dogs.";
		String newsentences=sentences.replace("Dogs","Anna");
		System.out.println(sentences);
		System.out.println(newsentences);
		
		System.out.println("********************************");
		
		System.out.println(sentences.contains("goal"));
		System.out.println(newsentences.contains("Anna"));
		
		System.out.println("********************************");
		
		String sent1= sentences.substring(3,9);
		System.out.println(sent1);
		
		String sent2= sentences.substring(2);
		System.out.println(sent2);
		
		System.out.println("*********************************");
		
		String word[]= sentences.split(",");
		
		for(String words : word)
		{
			System.out.println(words);
		}
		
		System.out.println("********************************");
		
		String colour="White is my fav colour.";
		char tat[]= colour.toCharArray();
		
		for(char col:tat)
		{
			System.out.println(col);
		}
		
		System.out.println("********************************");
		
		String best="";
		if(best.isEmpty())
		{
			System.out.println("Empty.");  //This method is used for checking 'Empty Spaces'.
		}
		
//		else if(best.isBlank())
 //		{
//			System.out.println("Blank");  //This method is used for checking 'Blank Spaces'.
//		}
		
	}

}
