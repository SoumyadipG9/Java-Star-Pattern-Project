package Project;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Enter two numbers: ");
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("What you want to do - ");
		int res=sc.nextInt();
       // c=sc.nextInt();
        
		switch(res)
		{
		case 1: c=a+b;
		System.out.println("Sum of the two numbers - "+c);
		break;
		
		case 2: c=a-b;
		System.out.println("Subtraction of the two numbers - "+c);
		break;
		
		case 3: c=a*b;
		System.out.println("Multiplication of the two numbers - "+c);
		break;
		
		case 4: c=a/b;
		System.out.println("Divition of the two numbers - "+c);
		break;
		
		case 5: c=a%b;
		System.out.println("Remender of the two numbers - "+c);
		break;
		
		default:
			System.out.println("Sorry! Invalid Number");
		}
	}

}
