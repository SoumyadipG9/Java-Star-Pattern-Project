package Star_Pattern_Practices;

public class Star_1 {

	public static void main(String[] args) {
		
		int size=6;
		goal(size);

	}
	
	  static void goal(int n)
	  {
		  for(int row=1; row<n; row++)
		  {
			  for(int col=1; col<n; col++)
			  {
				  System.out.print("*");
			  }
			  
			  System.out.println();
		  }
	  }

}
