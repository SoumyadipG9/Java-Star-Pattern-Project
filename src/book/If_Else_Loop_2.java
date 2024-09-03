package book;

import java.util.Scanner;

public class If_Else_Loop_2 {

	public static void main(String[] args) {
		
		System.out.println("Enter Your Password - ");
		
		int psw;
		Scanner sc=new Scanner(System.in);
		psw=sc.nextInt();
		
		
		if(psw==2003)
		{
		   System.out.println("Hi - Soumyadip , have a good day.");
		}
		else
		{
			System.out.println("Sorry! Wrong Password");
		}

	}

}
