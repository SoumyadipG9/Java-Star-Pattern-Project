package book;

public class Patterns_On_Nested_For_Loop {

	public static void main(String[] args) {
		
		for(int i=0; i<=16; i++)
		{
			for(int j=0; j<=i; j++)                     //Patterns On Nested For Loop.
			{
				  System.out.print("*");
				//System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		for(int i=0; i<=12; i++)
		{
			int g=0;
			while(g <= 9)
			{
				//System.out.print(g+" ");
				System.out.print("$");                    //Patterns On Nested For Loop.
				g++;
			}
			
			System.out.println();
		}
		
		                                                       
	}

}
