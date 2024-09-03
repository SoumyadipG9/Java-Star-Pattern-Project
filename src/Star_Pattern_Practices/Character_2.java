package Star_Pattern_Practices;

public class Character_2 {

	public static void main(String[] args) {
		int size=6;
		hi(size);

	}
	
	  static void hi(int n)
	  {
		  for(int row=1; row<n; row++)
		  {
			  char c='A';
			  for(int col=1; col<n; col++)
			  {
				  System.out.print(c);
				  c=(char)(c+1);
			  }
			  System.out.println();
		  }
	  }

}
