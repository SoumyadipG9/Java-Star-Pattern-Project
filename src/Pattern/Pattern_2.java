package Pattern;

public class Pattern_2 {

	public static void main(String[] args) {
		
	      int size=6;
	      goal(size);
		

	}
	
	
	   public static void goal(int n)
	   {
		   for(int row=1; row<n; row++)
		   {
			   for(int col=1; col<=n; col++)
			   {
				   System.out.print(row);
			   }
			   
			   System.out.println();
		   }
	   }

}
