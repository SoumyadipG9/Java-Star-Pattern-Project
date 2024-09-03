package book;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
		
//		int n =1;
//		                                                     //This is a while loop program.
//		while(n<6)                          
//		{
//			System.out.println("Hi Soumyadip - Have a good day.");
//			      n++;
//		}
		
		System.out.println("Are you learn new things?");
		Scanner sc=new Scanner(System.in);
		
		boolean learn = false;
		
		while(!learn)
		{
			System.out.println("GO to college - if you not learn.");
			                                                                
			                                                                //This is a while loop program.
			learn=sc.nextBoolean();
			
		}
		
		System.out.println("When you learn go to party.");

	}

}
