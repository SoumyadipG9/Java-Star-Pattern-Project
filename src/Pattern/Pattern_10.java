package Pattern;

public class Pattern_10 {

	public static void main(String[] args) {
		
		int size=6;
		gol(size);

	}
	
	static void gol(int hi)
	{
		char c='A';
		for(int row=1; row<=hi; row++)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print((char)(c));
				
			}
			
			System.out.println(" ");
			
			c=(char)(c+1);  // This line is  responsible for this answer.
		
		    }
	
	}

}
