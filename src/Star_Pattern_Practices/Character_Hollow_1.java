package Star_Pattern_Practices;

public class Character_Hollow_1 {

	public static void main(String[] args) {
	
		int size=8;
		go(size);

	}
	
	  static void go(int n)
	  {
		  char c='A';
		  for(int row=1; row<n; row++)
		  {
			  //char c='A';
			  for(int col=1; col<n; col++)
			  {
				  if(row==1 || col==1 || row==n-1 || col==n-1 )
				  {
					  System.out.print(c +" ");
					  c=(char)(c+1);
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
