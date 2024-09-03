package Pattern;

import java.util.Scanner;

public class Diamond_Pattern_1 {

	public static void main(String[] args) {
		
		goal();
		
	}
	
	  static void goal()
	  {
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.print("Enter the number for rows [Odd-Number]- ");
		  
		  int row=sc.nextInt();
		  
		  int space=row/2;
		  int star=1;
		  
		  for(int i=1; i<=row; i++)
		  {
			  for(int j=1; j<=space; j++)
			  {  
				  System.out.print(" ");
			  }
			  for(int k=1; k<=star; k++)
			  {
				  System.out.print("*");
			  }
			  System.out.println();
			  if(i<=row/2)
			  {
				  space--;
				  star=star+2;
			  }
			  else
			  {
				  space++;
				  star=star-2;
			  }
		  }
				  
	  }

}
