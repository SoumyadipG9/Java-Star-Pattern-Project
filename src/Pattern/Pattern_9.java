package Pattern;

public class Pattern_9 {

	public static void main(String[] args) {
		
		int size=8;
		goal(size);

	}
	
	   static void goal(int n)
	   {
		   for(int row=1; row<=n; row++)
		   {
			   for(int col=1; col<row; col++)
			   {
				   System.out.print("*");
			   }
			   
			   System.out.println("*");
		   }
	   }

}
