package Pattern;

public class Pattern_18 {

	public static void main(String[] args) {
		int size=6;
		gift(size);
	}
	
	static void gift(int hi)
	{
		for(int row=0; row<hi; row++)
		{
			for(int col=1; col<=hi-row; col++)
			
				System.out.print(" ");
				
				for(int margin=0; margin<=row; margin++)
				
					System.out.print("*");
					
					System.out.println();
					
		}
	}

}
