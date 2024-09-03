package Pattern;

public class Pattern_17 {

	public static void main(String[] args) {
		
		int size=5;
		tat(size);

	}
	
	  static void tat(int g)
	  {
		  char gol='A';
		  for(int row=0; row<2*g; row++)
		  {
			  int margin= row>g? 2*g-row: row;
			  
			  for(int col=1; col<margin; col++)
			  {
				  System.out.print(gol);
				    gol=(char)(gol+1);
			  }
			  
			    // gol++;
			  System.out.println(" ");
		  }
	  }

}
