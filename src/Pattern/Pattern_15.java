package Pattern;

public class Pattern_15 {

	public static void main(String[] args) {
	
		int size=6;
          hi(size);
	}
	
	  static void hi(int n)
	  {
		 
		  char c='A';
		  for(int row=0; row<2*n; row++)
		  {
			  int margin=row>n? 2*n-row: row;
			  
			  for(int col=1; col<margin; col++)
			  {
				  System.out.print("*");    
			  }
			 
			  System.out.println(" ");
			  
		  }
	  }
}
