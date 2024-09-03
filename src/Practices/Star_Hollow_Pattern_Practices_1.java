package Practices;

public class Star_Hollow_Pattern_Practices_1 {

	public static void main(String[] args) {
	
		int size=5;
		jak(size);

	}
	
	
	 static void jak(int n)
	 {
		 for(int row=1; row<n; row++)
		 {
			 for(int col=1; col<n; col++)
			 {
				 if(row==1 || col==1 || row==n-1 || col==n-1)
				 {
					 System.out.print("* ");
				 }
				 else
				 {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }
	 }

}
