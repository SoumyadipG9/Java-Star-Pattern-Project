package Star_Pattern_Practices;

public class Star_Triangle_Pattern_Practices_1 {

	public static void main(String[] args) {
          
		int size=6;
		goal(size);

	}
	
	     static void goal(int hi)
	     {
	    	 for(int row=0; row<hi; row++)
	    	 {
	    		 for(int col=1; col<=hi-row; col++)
	    		 {
	    			 System.out.print(" ");
	    		 }
	    		 
	    		 for(int margin=0; margin<=row; margin++)
	    		 {
	    			 System.out.print("* ");
	    		 }
	    		 
	    		 System.out.println();
	    	 }
	     }

}
