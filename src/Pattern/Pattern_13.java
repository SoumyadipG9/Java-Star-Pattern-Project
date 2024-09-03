package Pattern;

public class Pattern_13 {

	public static void main(String[] args) {
       int size=6;	
       yap(size);

	}
	
	static void yap(int n)
	{
		char cr='A';
		
		for(int row=1; row<=n; row++)
		{
			
			for(int col=1; col<=n-row+1; col++)
			{
				System.out.print(cr+" ");
				//cr=(char)(cr+1);
			}
			System.out.println(" ");
			cr++;
		}
	}

}
