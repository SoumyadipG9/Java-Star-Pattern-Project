package Star_Pattern_Practices;

public class Character_3 {

	public static void main(String[] args) {
		int size=5;
		goal(size);

	}
	
	 static void goal(int n)
	  {
		 char c='A';
		  for(int row=1; row<n; row++)
		  {
			  for(int col=1; col<n; col++)
			  {
				  if(row==1 || col==1 || row==n-1 || col==n-1)
				  {
					  System.out.print(c+" ");
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
