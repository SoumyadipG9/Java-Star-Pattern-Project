package Pattern;

public class Pattern_8 {

	public static void main(String[] args) {
		int size=6;
		rat(size);
	}
	
	  static void rat(int g)
	  {
		  for(int row=1; row<g; row++)
		  {
			  char ch='A';
			  for(int col=1; col<g; col++)
			  {
				  if(row==1 ||col==1 || row==-g || col==-g)
				  {
					  System.out.print((char)(ch));
					  ch=(char)(ch+1);
				  }
				  
				  else
				  {
					  System.out.print(" ");
				  }
				  
			  }
			  
			  System.out.println(" ");
		  }
	  }

	

}
