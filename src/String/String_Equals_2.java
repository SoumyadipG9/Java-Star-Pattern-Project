package String;

public class String_Equals_2 {

	public static void main(String[] args) {
		
        String name="Soumyadip";
		
		String newname=new String("SOUMyadip");
		
//		if(name.equals(newname))
//		{
//			System.out.println("Both are same.");
//		}
//		
//		else
//		{
//			System.out.println("Both are not same.");
//		}

		
		if(name.equalsIgnoreCase(newname))
		{
			System.out.println("Both are same.");
		}
		
		else
			{
				System.out.println("Both are not same.");
			}
		
	}

}
