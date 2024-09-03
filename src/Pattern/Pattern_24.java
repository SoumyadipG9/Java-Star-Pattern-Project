package Pattern;

public class Pattern_24 {

	public static void main(String[] args) {
		int size=6;
		goal(size);

	}
	
	static void goal(int n)
	{
		
		for(int row=0; row<n; row++)
		{
			char c='A';
			for(int col=0; col<n; col++)
			
				if(col<row)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(c+" ");
					c++;                  //This line is responsible for this answer.  
				}
			System.out.println();
		}
	}

}
