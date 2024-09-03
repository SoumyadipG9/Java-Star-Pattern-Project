package Practices;

import java.util.Scanner;

public class IF_Else_1 {

	public static void main(String[] args) {
	
		System.out.println("Enter your password: ");
		
		int p;
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		
		if(p==2003)
		{
			System.out.println("Hi Soumyadip, have a good day.");
		}
		
		else
		{
			System.out.println("Sorry Wrong Password.");
		}

	}

}
