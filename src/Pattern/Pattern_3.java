package Pattern;

public class Pattern_3 {

	public static void main(String[] args) {
		
		  int size=6;
		  run(size);
	}
	
	public static void run(int n)
	{
		char c='A';
		for(int row=1; row<n; row++)
		{
			for(int col=1; col<n; col++)
			{
			   //  System.out.println();
				System.out.print(c);
				c=(char)(c+1);
			}
			System.out.println();
		}
	}

	

}
