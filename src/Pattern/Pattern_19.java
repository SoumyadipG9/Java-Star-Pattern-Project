package Pattern;

public class Pattern_19 {

	public static void main(String[] args) {
		
		int size=6;
		hi(size);

	}
	
	static void hi(int n)
	{
		for(int row=0; row<n; row++)
		{
			for(int col=1; col<=n-row; col++)
				
				  System.out.print(" ");
		
			for(int margin=0; margin<=row; margin++)
				
				System.out.print("* ");
			
				System.out.print(" ");
			
			System.out.println();
			
		}
	}

}
