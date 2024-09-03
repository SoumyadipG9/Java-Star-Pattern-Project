package Pattern;

public class Pattern_23 {

	public static void main(String[] args) {
		
		int size=6;
		bob(size);

	}
	
	static void bob(int n)
	{
		
		for(int row=0; row<n; row++)
		{
			int num=1;
			for(int col=0; col<n; col++)
			
				if(col<row)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(num+" ");  //This line is responsible for this answer.
					num++;
				
				}
			
			System.out.println();
		}
	}

}
