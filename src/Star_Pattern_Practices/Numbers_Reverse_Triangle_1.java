package Star_Pattern_Practices;

public class Numbers_Reverse_Triangle_1 {

	public static void main(String[] args) {
		
		int size=5;
		bob(size);

	}
       
	      static void bob(int n)
	      {
	    	  for(int row=0; row<n; row++)
	    	  {
	    		  int num=1;
	    		  
	    		  for(int col=0; col<n; col++)
	    		  {
	    			  if(col<row)
	    			  {
	    				  System.out.print(" ");
	    			  }
	    			  else
	    			  {
	    				  System.out.print(num + " ");
	    				  num++;
	    			  }
	    		  }
	    		  System.out.println();
	    	  }
	      }
}
