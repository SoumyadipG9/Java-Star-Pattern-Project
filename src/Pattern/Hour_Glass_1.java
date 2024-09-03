package Pattern;

import java.util.Scanner;

public class Hour_Glass_1 {

	public static void main(String[] args) {
		hour_glass();

	}
	
	  static void hour_glass()
	  {
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.print("Enter the number for set 'Rows and Columns' of the hour-glass [Odd number]- ");
		      
		  int row=sc.nextInt();
		  
		  int star=0;
		  int margin=row;
		  
		  for(int a=1; a<=row; a++)
		  {
			  for(int b=1; b<a; b++)
				  
				  System.out.print(" ");
			  
				  for(int c=a; c<=row; c++)
				  {
					  System.out.print("* ");
		          }        
		         
				  System.out.println();
		  }
		  
		  for(int i=row-1; i >=1; i--)
		  {
			  for(int j=1;  j < i;  j++)
				  
				  System.out.print(" ");
			  
			  for(int k=i; k<=row; k++)
			  {
				  System.out.print("* ");
			  }
				 
			  System.out.println();
		  }
		  
		  
		  
		  
	  }

}
