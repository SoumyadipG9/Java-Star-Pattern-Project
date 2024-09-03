package Pattern;

public class Pattern_7 {

	public static void main(String[] args) {
		int size=6;
		bob(size);

	}
	
	   static void bob(int h)
	   {
		   
		   for(int row=1; row<h; row++)
		   {
			   char gol='A';
			   
			   for(int col=1; col<h; col++)
			   {
				   System.out.print(gol);
				   gol=(char)(gol+1);
			   }
			   System.out.println();
		   }
	   }


	
	
	

}
