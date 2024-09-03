package Star_Pattern_Practices;

public class Numbers_4 {

	public static void main(String[] args) {
       int size=4;
       goal(size);

	}
	
	  static void goal(int n)
	  {
		  int num=1;
		  for(int row=1; row<n; row++)
		  {
			  for(int col=1; col<n; col++)
			  {
				  if(row==1 || col==1 || row==n-1 || col==n-1)
				  {
					  System.out.print(num+" ");
					  num++;
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
