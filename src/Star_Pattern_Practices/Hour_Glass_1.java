package Star_Pattern_Practices;

import java.util.Scanner;

public class Hour_Glass_1 {

	public static void main(String[] args) {

		goal();

	}
         
	static void goal()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Numbers Of Row[Odd Numbers]: ");
		
		int row=sc.nextInt();
		
		int hi=0;
		
		int value=1;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=i; k<=row; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=row-1; i>=1; i--)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=i; k<=row; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
