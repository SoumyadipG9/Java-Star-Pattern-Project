package book;

import java.util.Scanner;

public class Practices_2 {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers - ");
		
//		System.out.println("Enter the day - ");
//			
//		int Day ;
//		
//		Scanner sc=new Scanner(System.in);
//		
//		Day=sc.nextInt();
//		
//		
//		if(Day==1)
//		{
//			System.out.println("Go back to your home and watching the TV or playing video games.");
//		}
//		
//		else if(Day==2)
//		{
//			System.out.println("Go to a night club and have some fun.");
//		}
//		
//		else if(Day==3)
//		{
//			System.out.println("Go to a cinema hall or a restaurent.");
//		}
//		else
//		{
//			System.out.println("Go to your offices.");
//		}
//		
		
//		int a;
//		int b;
//		int c;
//		                                         // This is a 'Nested if-else' program.
//		
//		Scanner sc=new Scanner(System.in);
//		
//		a=sc.nextInt();
//		b=sc.nextInt();
//		c=sc.nextInt();
//		
//		if(a>b)
//		{
//			if(a>c)
//			{
//				System.out.println("a - is bigest number-" +a);
//			}
//			
//			else
//			{
//				System.out.println("c - is bigest number-" +c);
//			}
//		}
//		
//		else
//		{
//			if(b>c)
//			{
//				System.out.println("b - is bigest number-" +b);
//			}
//			
//			else
//			{
//				System.out.println("c - is bigest number-" +c);
//			}
//		}
		
		int a=12;
		int b=22;
		int c=30;
		
	                                                          //This Is  Ternary Operator Program.
		                          
		int max=a>b ? a>c? a:c : b>c? b:c ;

		System.out.println(max);
	}

}
