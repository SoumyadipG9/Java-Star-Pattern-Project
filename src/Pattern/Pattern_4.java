package Pattern;

public class Pattern_4 {

	public static void main(String[] args) {
		
		int size=6;
		eat(size);
		
		
	}
	
	
	      static void eat(int n)
	  {
	    	  
			
	    for(int row=1; row<n; row++)
	    {
	    	   char c='A';
	    	for(int col=1; col<n; col++)
	    	{
	    		//System.out.print((char)(c));
	    		System.out.print(c);
	    		c=(char)(c+1);
	    	}
	    	
	    	System.out.println();
	    }
	  }
}
