package Star_Pattern_Practices;

public class Star_Hollow_1 {

	public static void main(String[] args) {
	
		int size=5;
		hi(size);

	}
	
	  static void hi(int n)
	  {
		  for(int row=1; row<n; row++)
		  {
			  for(int col=1; col<n; col++)
			  {
				   if(row==1 || col==1 || row==n-1 || col==n-1 )
				   {
//					   System.out.print(" ");
					   System.out.print("* ");
					   
				   }
				   
				   else
				   {
					   System.out.print("  ");
				   }
				 
			  }
			  System.out.println();
		  }
	  }

}
