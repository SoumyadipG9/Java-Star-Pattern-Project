package Star_Pattern_Practices;

public class Character_Reverse_Triangle_1 {

	public static void main(String[] args) {
		
		int size=6;
		good(size);

	}
         
	      static void good(int n)
	      {
	    	  for(int row=0; row<n; row++)
	    	  {
	    		  char c='A';
	    		  for(int col=0; col<n; col++)
	    		  {
	    			  if(col<row)
	    			  {
	    				  System.out.print(" ");
	    			  }
	    			  else
	    			  {
	    				  System.out.print(c + " ");
	    				  c++;
	    			  }
	    		  }
	    		  System.out.println();
	    	  }
	      }
}
