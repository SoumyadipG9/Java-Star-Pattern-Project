package Star_Pattern_Practices;

public class Numbers_Right_Triangle_1 {

	public static void main(String[] args) {
		
		int size=6;
		car(size);
	
	}
	
	   static void car(int n)
	   {
//		   int num=1;
		   
		   for(int row=0; row<n; row++)
		   {
			    int num=1;
			   for(int col=1; col<=n-row; col++)
			   {
				   System.out.print(" ");
			   }
			   
			   for(int margin=0; margin<=row; margin++)
			   {
				   System.out.print(num);
				   num++;
			   }
			   System.out.println();
		   }
	   }

}
