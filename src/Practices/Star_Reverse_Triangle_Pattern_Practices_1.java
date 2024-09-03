package Practices;

public class Star_Reverse_Triangle_Pattern_Practices_1 {

	public static void main(String[] args) {
		
		int size=6;
		hi(size);

	}
	
	  static void hi(int n)
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
