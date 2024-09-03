package Star_Pattern_Practices;

public class Star_Pattern_Triangle_1 {

	public static void main(String[] args) {
		
		int size=5;
		goal(size);

	}
	
	static void goal(int n)
	{
      	//int num=1;
		for(int row=1; row<2*n; row++)
		{
			int col= row>n ? 2*n-row : row;
			
			for(int margin=1; margin<col; margin++)
			{
				System.out.print("* ");
				
				
			}
			 
			System.out.println();
		}
	}

}
