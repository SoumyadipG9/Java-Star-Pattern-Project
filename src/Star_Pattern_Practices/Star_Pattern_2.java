package Star_Pattern_Practices;

public class Star_Pattern_2 {

	public static void main(String[] args) {
		
		int size=5;
		goal(size);
	
	}

	   static void goal(int n)
	   {
		   for(int row=0; row<n; row++)
		   {
			   for(int col=0; col<n-row; col++)
			   {
				   System.out.print("*");
			   }
			   System.out.println();
		   }
	   }
}
