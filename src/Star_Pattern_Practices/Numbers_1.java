package Star_Pattern_Practices;

public class Numbers_1 {

	public static void main(String[] args) {
		int size=6;
		bob(size);

	}
	
	   static void bob(int n)
	   {
		   int num=1;
		   
		   for(int row=1; row<n; row++)
		   {
			   for(int col=1; col<n; col++)
			   {
				   //System.out.print(row);
				   System.out.print(num);
			   }
			   System.out.println();
			     num++;
		   }
	   }

}
