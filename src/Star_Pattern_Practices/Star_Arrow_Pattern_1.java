package Star_Pattern_Practices;

public class Star_Arrow_Pattern_1 {

	public static void main(String[] args) {
		int size=8;
		goal(size);

	}
   
	    static void goal(int g)
	    {
	    	for(int row=1; row<=g; row++)
	    	{
	    		for(int col=1; col<=row; col++)
	    		{
	    			//System.out.print(" ");
	    			 System.out.print("* ");
	    		}
	    		System.out.println();
	    	}
	    }
}
