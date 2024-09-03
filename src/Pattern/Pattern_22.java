package Pattern;

public class Pattern_22 {

	public static void main(String[] args) {
		
		int size=5;
		hi(size);

	}
	
	   static void hi(int n)
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
					   System.out.print("* ");
					  
				   }
			   System.out.println();
		   }
	   }

}
