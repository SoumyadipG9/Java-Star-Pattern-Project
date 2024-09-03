package Star_Pattern_Practices;

public class Star_Right_Triangle_1 {

	public static void main(String[] args) {
		int size=6;
		goal(size);
		

	}
	
	  static void goal(int h)
	  {
		  for(int row=0; row<h; row++)
		  {
			  
			  for(int col=1; col<=h-row; col++)
			  {
				  System.out.print(" ");
			  }
			  
				  for(int margin=0; margin<=row; margin++)
				  {
					  System.out.print("*");
				  }
				 
			  System.out.println();
		  }
	  }

}
