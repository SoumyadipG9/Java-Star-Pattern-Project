package Pattern;

public class Pattern_12 {

	public static void main(String[] args) {
		
		int size=6;
        hi(size);
	}
	
	  static void hi(int t)
	  {
		  //int num=1;
		  for(int row=1; row<=t; row++)
		  {
         	 // int num=1;
			  for(int col=1; col<=t-row; col++)
			  {
				  System.out.print("*");
				// num=num+1;
				  
			  }
			  
			  System.out.println(" ");
			  
			  
		  }
	  }

}
