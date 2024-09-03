package book;

import java.util.Scanner;

public class Practices_4 {

	public static void main(String[] args) {
		 
		//System.out.println("Enter a number: ");
//		int num;
//		Scanner sc=new Scanner (System.in);
//		num=sc.nextInt();
		
//		for (int i=1; i<=10; i++)
//		{
//			System.out.println(num +" * "+ i +" = " + i*num);       // This is for number table.
//		}
		
		System.out.println("Enter a number: ");
		int sum=0;
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for (int i=1; i<=n; i++) 
		{                                                            //For Loop Program.
			  sum=sum+2*i;
			  
			//sum += 2*i;
		}
		
		System.out.println(sum);
		
	}

}
