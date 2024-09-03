package Star_Pattern_Practices;

public class Numbers_2 {

	public static void main(String[] args) {
		
		int size=6;
		eat(size);

	}
	
	   static void eat(int n)
	   {
		  
		   for(int row=1; row<n; row++)
		   {
			   for(int col=1; col<n; col++)
			   {
				   System.out.print(col);
			   }
			   
			   System.out.println();
		   }
	   }

}
