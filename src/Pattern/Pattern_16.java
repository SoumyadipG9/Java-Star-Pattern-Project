package Pattern;

public class Pattern_16 {

	public static void main(String[] args) {
		
		int size=6;
		goal(size);

	}
	
	 static void goal(int n)
	 {
		 int num=1;
		 for(int row=1; row<2*n; row++)
		 {
			 int margin= row>n? 2*n-row: row;
			 
			 for(int col=1; col<=margin; col++) //This column line is responsible for '1 to end' output.
			 {
				 System.out.print(num);
				   //num=num+1;
			 }
         		 num++;
			 System.out.println(" ");
			 
		 }
	 }

}
