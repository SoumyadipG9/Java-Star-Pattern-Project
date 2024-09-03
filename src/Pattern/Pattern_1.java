package Pattern;

public class Pattern_1 {

	public static void main(String[] args) {
	          
		int size=5;
		
		patt(size);
	}
	
	   static void patt(int n)
	   {
			
	   
		for(int row=1; row<n; row++)
		{
			for(int col=1; col<=n;col++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	   }

}
