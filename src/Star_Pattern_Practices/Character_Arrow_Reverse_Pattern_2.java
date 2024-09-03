package Star_Pattern_Practices;

public class Character_Arrow_Reverse_Pattern_2 {

	public static void main(String[] args) {
		
		int size=6;
		car(size);

	}
	
	   static void car(int n)
	   {
		   char c='A';
		   for(int row=1; row<=n; row++)
		   {
			   for(int col=1; col<=n-row; col++)
			   {
				   System.out.print(c+" ");
			   }
			   System.out.println();
			   c++;
		   }
	   }

}
