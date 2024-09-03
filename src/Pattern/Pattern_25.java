package Pattern;

public class Pattern_25 {

	public static void main(String[] args) {
		int size=6;
		hii(size);

	}
	
	  static void hii(int n)
	  {
		  for(int row=0; row<n; row++)
		  {
			  for(int col=0; col<n; col++)
				  
				  if(col<row)
				  {
					  System.out.print(" ");
				  }
				  else
				  {
					 
					  System.out.print("*");
				  }
			  
			  System.out.println();
		  }
	  }

}
