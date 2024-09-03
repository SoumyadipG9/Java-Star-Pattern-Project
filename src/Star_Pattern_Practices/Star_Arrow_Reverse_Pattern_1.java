package Star_Pattern_Practices;

public class Star_Arrow_Reverse_Pattern_1 {

	public static void main(String[] args) {
		
		int size=6;
		hi(size);

	}
	
	  static void hi(int n)
	  {
		  for(int row=1; row<n; row++)
		  {
			 for(int col=1; col<=n-row; col++)
			 {
				  System.out.print("* ");
			 }
			  System.out.println();
		  }
	  }

}
