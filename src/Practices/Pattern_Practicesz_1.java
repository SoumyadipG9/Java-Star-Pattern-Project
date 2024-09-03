package Practices;

public class Pattern_Practicesz_1 {

	public static void main(String[] args) {
		
		int size=5;
         goal(size);
	}
	   
	static void goal(int n)
	{
		  for(int row=0; row<n; row++)
		  {
			  for(int col=0; col<row; col++)
			  {
				  System.out.print("* ");
			  }
			  System.out.println(" ");
		  }
	}
	   

}
