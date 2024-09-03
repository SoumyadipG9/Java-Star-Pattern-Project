package Star_Pattern_Practices;

public class Character_1 {

	public static void main(String[] args) {
		int size=5;
		zik(size);

	}
	
	  static void zik(int n)
	  {
		  char c='A';
		  for(int row=1; row<n; row++)
		  {
			  for(int col=1; col<n; col++)
			  {
				  System.out.print(c);
				   c=(char)(c+1);
			  }
			
			  System.out.println();
		  }
	  }

}
