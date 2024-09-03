package Star_Pattern_Practices;

public class Star_Side_Triangle_1 {

	public static void main(String[] args) {
		
		int size=5;
		eat(size);

	}
	
	   static void eat(int n)
	   {
		   for(int row=0; row<=2*n; row++)
		   {
			   int col=row>n? 2*n-row: row;
			   
			   for(int margin=0; margin<col; margin++)
			   {
				   System.out.print("*");
			   }
			   
			   System.out.println();
		   }
	   }

}
