package Star_Pattern_Practices;

public class Star_Triangle_With_Extra_Stars_1 {

	public static void main(String[] args) {
		
		int size=6;
		hi(size);

	}
	
	  static void hi(int n)
	  {
		  for(int row=0; row<n; row++)
		  {
			  for(int col=1; col<=n-row; col++)
			  {
				  System.out.print(" ");
			  }
			  
			  for(int margin=0; margin<=row*2; margin++)
			  {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
	  }

}