package Pattern;

public class Pattern_21 {

	public static void main(String[] args) {
		int size=5;
		we(size);

	}
	
	  static void we(int n)
	  {
		  for(int row=0; row<n; row++)
		  {
			  for(int col=0; col<n; col++)
				  
				  if(col<n-row)
				  {
					  System.out.print(" ");
				  }
			  
				  else
				  {
					  System.out.print("* ");
				  }
			  System.out.println();
		  }
	  }

}
