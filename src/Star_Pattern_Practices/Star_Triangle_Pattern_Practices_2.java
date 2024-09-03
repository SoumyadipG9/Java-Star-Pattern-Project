package Star_Pattern_Practices;

public class Star_Triangle_Pattern_Practices_2 {

	public static void main(String[] args) {
	
		int size=5;
		goal(size);
	}
          
	         static void goal(int n)
	         {
	        	 for(int row=0; row<n; row++)
	        	 {
	        		 for(int col=1; col<=n-row; col++)
	        		 {
	        			 System.out.print(" ");
	        		 }
	        		 
	        		 for(int margin=0; margin<=row; margin++)
	        		 {
	        			 System.out.print("* ");
	        		 }
	        		 System.out.println(" "); 
	        	 }
	        	 
	         }
}
