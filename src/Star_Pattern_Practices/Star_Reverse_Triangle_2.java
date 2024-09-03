package Star_Pattern_Practices;

public class Star_Reverse_Triangle_2 {

	public static void main(String[] args) {
	
		int size=5;
		goal(size);

	}
	
	     static void goal(int n)
	     {
	    	 for(int row=1; row<n; row++)
	    	 {
	    		 for(int col=1; col<n; col++)
	    		 {
	    			if(col<row)
	    			{
	    				System.out.print(" ");
	    			}
	    			else
	    			{
	    				System.out.print("* ");
	    			}
	    		 }
	    		 System.out.println();
	    	 }
	     }

}
