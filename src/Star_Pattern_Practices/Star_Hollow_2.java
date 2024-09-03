package Star_Pattern_Practices;

public class Star_Hollow_2 {

	public static void main(String[] args) {
		
		int size=6;
		goal(size);

	}
	
	    static void goal(int n)
	    {
	    	for(int row=1; row<n; row++)
	    	{
	    		for(int col=1; col<n; col++)
	    		{
	    			if(row==1 || col==1 || row==n-1 || col==n-1)
	    			{
	    				System.out.print("* ");
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
