package Star_Pattern_Practices;

public class Character_Arrow_Pattern_1 {

	public static void main(String[] args) {
		
		int size=6;
		hello(size);

	}
	
	     static void hello(int n)
	     {
//	    	 char c='A';
	    	 for(int row=1; row<=n; row++)
	    	 {
	    		 char c='A';
	    		 for(int col=1; col<=row; col++)
	    		 {
	    			 System.out.print(c);
	    			 c=(char)(c+1);
	    		 }
	    		 
	    		 System.out.println();
	    	 }
	     }

}
