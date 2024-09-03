package book;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		System.out.println("Enter Your Age: ");
		
		int age;
		
		Scanner sc=new Scanner(System.in);
		
		age=sc.nextInt();
		
       if(age>=18)
       {
    	   System.out.println("You are eligible for vote.");
       }
       
       else
       {
    	   System.out.println("Sorry! You are not eligible for vote.");
       }

	}

}
