package Pattern;

public class Pattern_11 {

	public static void main(String[] args) {
		
		int size=6;
		hi(size);

	}
	
	static void hi(int n)
	{
		//int num=1;
		for(int row=1; row<=n; row++)
		{
			int num=1;   //This line is responsible for this answer.
			
			for(int col=1; col<=row; col++)
			{
				System.out.print(num);
				num=num+1;
				
			}
			System.out.println(" ");
			
		}
	}

}
