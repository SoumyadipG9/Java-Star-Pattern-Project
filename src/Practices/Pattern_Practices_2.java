package Practices;

public class Pattern_Practices_2 {

	public static void main(String[] args) {
       int size=6;
       ray(size);

	}
	
	static void ray(int h)
	{
		
		for(int row=0; row<h; row++ )
		{
			for(int col=1; col<=h-row; col++)
			{
				System.out.print("");
				
				for(int margin=0; margin<=row; margin++)
				{
					
					System.out.print("* ");
					
					System.out.print(" ");
					
					System.out.println();
				}
				
			}
			
		}
	}
	

}
