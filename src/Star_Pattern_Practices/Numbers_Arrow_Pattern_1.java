package Star_Pattern_Practices;

public class Numbers_Arrow_Pattern_1 {

	public static void main(String[] args) {
		
		int size=9;
		hi(size);

	}
      
	   static void hi(int n)
	   {
		     //int num=1;
		   for(int row=1; row<=n; row++)
		   {
			    int num=1;
			   
			   for(int col=1; col<=row; col++)
			   {
				   System.out.print(num);
				   num++;
			   }
			   
			   System.out.println(" ");
		   }
	   }
}
