package book;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	System.out.println("Enter two numbers: ");
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		                                                               //This is a calculator program.
		System.out.println("Choose the operation: ");
		
		int number=sc.nextInt();
		
		
		switch(number)
		{
		case 1 : c=a+b;
			System.out.println("Adition of two numbers: "+c);
		      break;
		
		case 2: c=a-b;
			System.out.println("Subtraction of two numbers: "+c);
		    break;
		    
		case 3: c=a*b;
		System.out.println("Multiplication of two numbers: "+c);
	    break;
	    
		case 4: c=a/b;
		System.out.println("Divition of two numbers: "+c);
	    break;
	    
		case 5: c=a%b;
		System.out.println("Remender of two numbers: "+c);
	    break;
	    
	    default:
	    	System.out.println("Sorry! This Is Invalid");
	    
		}
		


	}

}
